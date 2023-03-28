package instagomes.decorator;

public class Vip extends Extra{
    public Vip(Componente componente){
        super(componente);
        nome = "Acesso Vip";
        custo = 1000.00;
    }
    
}
