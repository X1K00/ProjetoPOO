package instagomes;

import instagomes.interfaces.IFa;
import instagomes.interfaces.ICelebridade;
import instagomes.interfaces.INivelAssinatura;
import instagomes.niveis.Niveis;

public class Fa implements IFa{
    private String nome;
    private ICelebridade c;
    //private INivelAssinatura n;
    private Niveis n;
    
    public Fa(String nome){
        this.nome = nome;
    }

    @Override
    public void receber(Atualizacao a) {
        n.setMensagem(a.getMensagem());
        n.setExclusivo(a.getExclusio());
            
        System.out.println(this.nome);
        System.out.println("Ninel da Conta: "+n.getNome_nivel());
        n.receberConteudo();
        n.mandarMenssagem();
        n.vonteudoExclusi();
        System.out.println("\nRecebendo notificação de "+a.getNome()+"\nTitulo: "+a.getTitulo()+"\nConteudo: "+a.getConteudo()+"\nLegenda: "+a.getLegenda()+"\n");
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public void fazerInscricao(ICelebridade c, Niveis n) {
        c.assinarFa(this);
        this.n = n;
        this.c = c;
    }

    @Override
    public void cancelarInscricao(ICelebridade c) {
        c.cancelaFa(this);
    }
    
    
    
}
