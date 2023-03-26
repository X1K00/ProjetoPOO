package instagomes;

import instagomes.interfaces.IFa;
import instagomes.interfaces.ICelebridade;

public class Fa implements IFa{
    private String nome;
    private ICelebridade c;
    
    public Fa(String nome){
        this.nome = nome;
    }

    @Override
    public void receber(Atualizacao a) {
        System.out.println(this.nome+"\nRecebendo notificação de "+a.getNome()+"\nTitulo: "+a.getTitulo()+"\nConteudo: "+a.getConteudo()+"\nLegenda: "+a.getLegenda()+"\n");
    }

    @Override
    public void fazerInscricao(ICelebridade c) {
        c.assinarFa(this);
    }

    @Override
    public void cancelarInscricao(ICelebridade c) {
        c.cancelaFa(this);
    }
    
    
    
}
