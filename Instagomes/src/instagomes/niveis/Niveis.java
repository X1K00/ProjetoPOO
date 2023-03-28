package instagomes.niveis;

import instagomes.decorator.Componente;
import instagomes.interfaces.INivelAssinatura;

public abstract class Niveis extends Componente implements INivelAssinatura{ //Strategy
    private String mensagem;
    private String exclusivo;

    public String getMensagem() { //Envia a menssagem enviada pela Celebridade
        return mensagem;
    }

    public void setMensagem(String mensagem) { // Recebe a menssagem enviada pela celebridade
        this.mensagem = mensagem;
    }

    public String getExclusivo() { //Envia o conteudo exclusivo da celebridade
        return exclusivo;
    }

    public void setExclusivo(String exclusivo) { //Recebe o conteudo exclusivo da celebridade
        this.exclusivo = exclusivo;
    }
    
}
