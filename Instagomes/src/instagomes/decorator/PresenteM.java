package instagomes.decorator;

public class PresenteM extends Extra{ //Decorator - Assinatura para receber pacote de presentes relacionado a celebridade extra
    public PresenteM(Componente componente){
        super(componente);
        nome = "Presentes surpresa";
        valor = 500.00;
    }
    
}
