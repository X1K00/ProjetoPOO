package instagomes.interfaces;
import instagomes.Atualizacao;

public interface IFa {
    
    void receber(Atualizacao a);
    void fazerInscricao(ICelebridade c);
    void cancelarInscricao(ICelebridade c);
       
}

