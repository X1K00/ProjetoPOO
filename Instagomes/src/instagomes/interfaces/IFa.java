package instagomes.interfaces;
import instagomes.Atualizacao;
import instagomes.niveis.Niveis;

public interface IFa {
    
    void receber(Atualizacao a);
    void fazerInscricao(ICelebridade c,Niveis  n);
    void cancelarInscricao(ICelebridade c);
       
}

