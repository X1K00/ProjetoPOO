package instagomes.niveis;

import instagomes.interfaces.INivelAssinatura;

public class Basico implements INivelAssinatura{

    @Override
    public void receberConteudo() {
        System.out.println("Recebendo conteudo");
    }

    @Override
    public void mandarMenssagem() {}

    @Override
    public void vonteudoExclusi() {}
    
}
