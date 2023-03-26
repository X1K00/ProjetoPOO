package instagomes.niveis;

public class Basico extends Niveis{
    private String nom_nivel = "Basico";

    @Override
    public String getNome_nivel() {
        return nom_nivel;
    }  
    
    @Override
    public void receberConteudo() {
        System.out.println("Recebendo conteudo");
    }

    @Override
    public void mandarMenssagem() {}

    @Override
    public void vonteudoExclusi() {}
    
}
