package instagomes.decorator;

public abstract class Componente{ //Decorator
    protected String nome;
    protected double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return valor;
    }

    public void setCusto(double custo) {
        this.valor = custo;
    }
    
            
}

