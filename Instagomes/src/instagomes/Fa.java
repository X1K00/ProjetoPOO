package instagomes;

import instagomes.decorator.Extra;
import instagomes.decorator.PresenteM;
import instagomes.decorator.SemExtra;
import instagomes.decorator.Vip;
import instagomes.interfaces.IFa;
import instagomes.interfaces.ICelebridade;
import instagomes.niveis.Niveis;

public class Fa implements IFa{ // Classe que cria usuarios
    private String nome;
    private ICelebridade c;
    private Niveis n;
    private Extra e;
    
    public Fa(String nome){
        this.nome = nome;
    }
    public void assinarVip(){ // Função para assinar o ususario no acesso VIP (Decorator)
        e = new Vip(e);
    }
    public void assinarPresente(){ // Função para assinar o usuario no Pacote de presentes menssais (Decorator)
        e = new PresenteM(e);
    }
    public void cancelarAssinaturas(){ // Função para cancelar assinaturas do usuario (Decorator)
        e = new SemExtra(n);
    }

    @Override
    public void receber(Atualizacao a) { // Atualiza as postagens das celebridades
        n.setMensagem(a.getMensagem());
        n.setExclusivo(a.getExclusio());
            
        System.out.println(this.nome);
        System.out.println(e.getCusto()+" - "+e.getNome());
        System.out.println("Ninel da Conta: "+n.getNome_nivel());
        n.receberConteudo();
        n.mandarMenssagem();
        n.vonteudoExclusi();
        System.out.println("\nRecebendo notificação de "+a.getNome()+"\nTitulo: "+a.getTitulo()+"\nConteudo: "+a.getConteudo()+"\nLegenda: "+a.getLegenda()+"\n");
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public void fazerInscricao(ICelebridade c, Niveis n) { // Adciona o ususario a lista de inscritos da celebridade escolhida (Observer)
        c.assinarFa(this);
        this.n = n;
        this.c = c;
        e = new SemExtra(n);
    }

    @Override
    public void cancelarInscricao(ICelebridade c) { // Remove o usuario da lista de inscritos da celebridade (Observer)
        c.cancelaFa(this);
    }
    
    
    
}
