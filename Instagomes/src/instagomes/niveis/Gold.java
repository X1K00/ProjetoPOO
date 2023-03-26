package instagomes.niveis;

public class Gold extends Niveis{
    private String nom_nivel = "Gold";

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
    public void vonteudoExclusi() {}
    
}
