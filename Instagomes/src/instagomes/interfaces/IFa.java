package instagomes.interfaces;
import instagomes.Atualizacao;
import instagomes.niveis.Niveis;

public interface IFa { //Observer - Interface para classes de Fãs
    
    void receber(Atualizacao a);
    void fazerInscricao(ICelebridade c,Niveis  n);
    void cancelarInscricao(ICelebridade c);
       
}

