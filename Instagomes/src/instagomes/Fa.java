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
        System.out.println("Recebendo notificação de "+a.getNome()+"\nTitulo: "+a.getTitulo()+"\nConteudo: "+a.getConteudo()+"\nLegenda: "+a.getLegenda()+"\n");
    }

    @Override
    public void fazerInscricao(ICelebridade c) {
        c.assinarFa(this);
    }

    @Override
    public void cancelarInscricao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
