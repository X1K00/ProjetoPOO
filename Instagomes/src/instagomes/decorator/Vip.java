package instagomes.decorator;

public class Vip extends Extra{ // Decorator - Assinatura extra a acesso vip
    public Vip(Componente componente){
        super(componente);
        nome = "Acesso Vip";
        valor = 1000.00;
    }
    
}
