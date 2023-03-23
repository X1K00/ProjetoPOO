package instagomes.niveis;

import instagomes.interfaces.INivelAssinatura;

public class Gold implements INivelAssinatura{

    @Override
    public void receberConteudo() {
        System.out.println("Recebndo conteudo");
    }

    @Override
    public void mandarMenssagem() {
        System.out.println("Mandando menssagem");
    }

    @Override
    public void vonteudoExclusi() {
        System.out.println("Recebendo conteudo exclusivo");
    }
    
}
