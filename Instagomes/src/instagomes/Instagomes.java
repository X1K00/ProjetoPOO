package instagomes;

import instagomes.niveis.Basico;
import instagomes.niveis.Gold;
import instagomes.niveis.Premium;

public class Instagomes {

    public static void main(String[] args) {
        Basico b = new Basico();
        Gold g = new Gold();
        Premium p = new Premium();
        
        Celebridade m = new Celebridade("Manel Gome");
        Celebridade l = new Celebridade("Luva de Pedreiro");
        Celebridade x = new Celebridade("Xuxa");
       
        Fa fm1 = new Fa("fã do manel 1");
        Fa fl1 = new Fa("fã do luva 1");
        Fa fl2 = new Fa("fã do luva 2");
        
        fm1.fazerInscricao(m, b); // Fã fazendo inscrição, indicando a celebridade - Strategy e nivel da conta
        fl1.fazerInscricao(l, g);
        fl2.fazerInscricao(l, p);
        
        fl1.assinarVip();
        fl1.assinarPresente();
        // O fã fl1 aasinou os extras: acesso vip e pacote de presente - Decorator
        
        Atualizacao a1 = new Atualizacao();
        a1.setNome(l.getNome());
        a1.setConteudo("conteudo luva 1");
        a1.setLegenda("legenda luva 1");
        a1.setTitulo("titulo luva 1");
        a1.setMensagem("menssagem luva 1");
        a1.setExclusio("exclusivo luva 1");
        
        l.setAtualizacao(a1);
        l.notificaFa();
        
        
        Atualizacao a2 = new Atualizacao();
        a2.setNome(m.getNome());
        a2.setConteudo("conteudo manel 1");
        a2.setLegenda("legenda manel 1");
        a2.setTitulo("titulo manel 1");
        a2.setMensagem("menssagem manel 1");
        a2.setExclusio("exclusivo manel 1");
        
        m.setAtualizacao(a2);
        m.notificaFa();
        
 
        ////////////////////////////////////////////////////////
        System.out.println("Um mês depois...###########################################################################################\n");
        
        fl2.cancelarInscricao(l); //O fã fl2 cancelando a inscrição na Celebridade l
        fl1.cancelarAssinaturas(); //O fã fl1 cancelando as assinaturas extras
        
        a1.setNome(l.getNome());
        a1.setConteudo("conteudo luva 2");
        a1.setLegenda("legenda luva 2");
        a1.setTitulo("titulo luva 2");
        a1.setMensagem("menssagem luva 2");
        a1.setExclusio("exclusivo luva 2");
        
        l.setAtualizacao(a1);
        l.notificaFa();
        
        
        a2.setNome(m.getNome());
        a2.setConteudo("conteudo manel 2");
        a2.setLegenda("legenda manel 2");
        a2.setTitulo("titulo manel 2");
        a2.setMensagem("menssagem manel 2");
        a2.setExclusio("exclusivo manel 2");
        
        m.setAtualizacao(a2);
        m.notificaFa();
        
        
    }
    
}
