package instagomes.decorator;

public abstract class Extra extends Componente{
    private Componente componente;
    
    public Extra(Componente componente){
        this.componente = componente;
    }
    public Componente getComponente(){
        return componente;
    }
    
    @Override
    public double getCusto() {
        return this.custo + componente.getCusto();
    }
    @Override
    public String getNome() {
        return componente.getNome() + ", " +
        this.nome;
    }
    
}
