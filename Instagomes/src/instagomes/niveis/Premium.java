package instagomes.niveis;

public class Premium extends Niveis{
    private String nom_nivel = "Premium";
    public Premium(){
        this.nome = nom_nivel;
        this.custo = 200.00;
    }

    @Override
    public String getNome_nivel() {
        return nom_nivel;
    }

    @Override
    public void receberConteudo() {
        System.out.println("Recebendo conteudo");
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
