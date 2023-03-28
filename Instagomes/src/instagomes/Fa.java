package instagomes;

import instagomes.decorator.Extra;
import instagomes.decorator.Presentes;
import instagomes.decorator.SemExtra;
import instagomes.decorator.Vip;
import instagomes.interfaces.IFa;
import instagomes.interfaces.ICelebridade;
import instagomes.niveis.Niveis;

public class Fa implements IFa{
    private String nome;
    private ICelebridade c;
    //private INivelAssinatura n;
    private Niveis n;
    private Extra e;
    
    public Fa(String nome){
        this.nome = nome;
    }
    public void assinarVip(){
        e = new Vip(e);
    }
    public void assinarPresente(){
        e = new Presentes(e);
    }

    @Override
    public void receber(Atualizacao a) {
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
    public void fazerInscricao(ICelebridade c, Niveis n) {
        c.assinarFa(this);
        this.n = n;
        this.c = c;
        e = new SemExtra(n);
    }

    @Override
    public void cancelarInscricao(ICelebridade c) {
        c.cancelaFa(this);
    }
    
    
    
}
