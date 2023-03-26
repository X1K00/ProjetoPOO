package instagomes.niveis;

import instagomes.interfaces.INivelAssinatura;

public abstract class Niveis implements INivelAssinatura{
    private String mensagem;
    private String exclusivo;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getExclusivo() {
        return exclusivo;
    }

    public void setExclusivo(String exclusivo) {
        this.exclusivo = exclusivo;
    }
    
}
