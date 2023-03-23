package instagomes.celebridades;

import instagomes.Atualizacao;
import instagomes.interfaces.IFa;
import instagomes.interfaces.ICelebridade;
import java.util.ArrayList;
import java.util.List;

public abstract class Celebridade implements ICelebridade{
    private List<IFa> assinantes = new ArrayList();
    private Atualizacao a;
  
    @Override
    public void assinarFa(IFa f) {
        assinantes.add(f);
    }

    @Override
    public void cancelaFa(IFa f) {
        assinantes.remove(f);
    }

    @Override
    public void notificaFa() {
        for (IFa f : assinantes)
            f.receber(a);
    }
    public void setAtualizacao(Atualizacao a){
        this.a = a;
    }
}
