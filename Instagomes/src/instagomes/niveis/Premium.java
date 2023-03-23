package instagomes.niveis;

import instagomes.interfaces.INivelAssinatura;

public class Premium implements INivelAssinatura{

    @Override
    public void receberConteudo() {
        System.out.println("Recebendo conteudo");
    }

    @Override
    public void mandarMenssagem() {
        System.out.println("Mandando Menssagem");
    }

    @Override
    public void vonteudoExclusi() {}
    
}
