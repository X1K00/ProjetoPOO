package instagomes.niveis;

public class Basico extends Niveis{ //Strategy - A assinatura basica, vai receber apenas o conteudo normal
    private String nom_nivel = "Basico";
    public Basico(){
        this.nome = nom_nivel;
        this.valor = 10.00;
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
    public void mandarMenssagem() {}

    @Override
    public void vonteudoExclusi() {}
    
}
