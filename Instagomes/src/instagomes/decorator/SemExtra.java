package instagomes.decorator;

public class SemExtra extends Extra{ //Decorator - Ausencia de assinatura extra
    public SemExtra(Componente componente){
        super(componente);
        nome = "Acesso padrão";
        valor = 0;
    }
    
}
