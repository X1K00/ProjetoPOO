package instagomes;

import instagomes.celebridades.Celebridade;
import instagomes.celebridades.ManelGome;
import instagomes.celebridades.LuvaPedreiro;

public class Instagomes {

    public static void main(String[] args) {
        Celebridade m = new Celebridade("Manel Gome");
        Celebridade l = new Celebridade("Luva de Pedreiro");        
        
        
        
        Fa f2 = new Fa("fã do luva 1");
        f2.fazerInscricao(l);
        
        Fa f1 = new Fa("fã do manel 1");
        f1.fazerInscricao(m);
        
        Fa f3 = new Fa("fã do luva 2");
        f3.fazerInscricao(l);
        
        
        
        
        Atualizacao a1 = new Atualizacao();
        a1.setNome(l.getNome());
        a1.setConteudo("conteudo luva 1");
        a1.setLegenda("legenda luva 1");
        a1.setTitulo("titulo luva 1");
        
        l.setAtualizacao(a1);
        l.notificaFa();
        
        
        Atualizacao a2 = new Atualizacao();
        a2.setNome(m.getNome());
        a2.setConteudo("conteudo manel 1");
        a2.setLegenda("legenda manel 1");
        a2.setTitulo("titulo manel 1");
        
        m.setAtualizacao(a2);
        m.notificaFa();
        
 
        ////////////////////////////////////////////////////////
        System.out.println("Uma semana depois...\n");
        
        f3.cancelarInscricao(l);
        
        a1.setNome(l.getNome());
        a1.setConteudo("conteudo luva 2");
        a1.setLegenda("legenda luva 2");
        a1.setTitulo("titulo luva 2");
        
        l.setAtualizacao(a1);
        l.notificaFa();
        
        
        a2.setNome(m.getNome());
        a2.setConteudo("conteudo manel 2");
        a2.setLegenda("legenda manel 2");
        a2.setTitulo("titulo manel 2");
        
        m.setAtualizacao(a2);
        m.notificaFa();
        
        
    }
    
}
