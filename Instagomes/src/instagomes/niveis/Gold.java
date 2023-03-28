package instagomes.niveis;

public class Gold extends Niveis{ // Strategy - A assinatura Gold vai receber conteudo basico, receber menssagens da celebridade e receber conteudo exclusivo
    private String nom_nivel = "Gold";
    public Gold(){
        this.nome = nom_nivel;
        this.valor = 100.00;
    }

    @Override
    public String getNome_nivel() {
        return nom_nivel;
    }

    @Override
    public void receberConteudo() {
        System.out.println("Recebendo conteudo...");
    }

    @Override
    public void mandarMenssagem() {
        System.out.println(getMensagem());
    }

    @Override
    public void vonteudoExclusi() {
        System.out.println(getExclusivo());
    }
        
}
