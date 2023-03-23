package instagomes;

import instagomes.celebridades.ManelGome;
import instagomes.celebridades.LuvaPedreiro;

public class Instagomes {

    public static void main(String[] args) {
        ManelGome m = new ManelGome();
        LuvaPedreiro l = new LuvaPedreiro();
        
        Fa f1 = new Fa("MCGorila");
        f1.fazerInscricao(m);
        
        Fa f2 = new Fa("Toguro");
        f2.fazerInscricao(l);
        
        Fa f3 = new Fa("Zuleide");
        f3.fazerInscricao(l);
        
        Atualizacao a1 = new Atualizacao();
        a1.setNome("Luva de Pedreiro");
        a1.setConteudo("Foto chutando bola na trave");
        a1.setLegenda("Graças a deus meu pai");
        a1.setTitulo("Melhor do mundo");
        
        l.setAtualizacao(a1);
        l.notificaFa();
        
        
        Atualizacao a2 = new Atualizacao();
        a1.setNome("Manel Gome");
        a2.setConteudo("Foto dando Joinha enquanto assiste um acidente de moto");
        a2.setLegenda("Eu vou deixar de ser besta");
        a2.setTitulo("Caneta Azul");
        
        l.setAtualizacao(a2);
        l.notificaFa();
        
 
        ////////////////////////////////////////////////////////
        System.out.println("Uma semana depois...\n");
        
        
        a1.setNome("Luva de Pedreiro");
        a1.setConteudo("Video");
        a1.setLegenda("Recebaaaaaaaaaaaaa");
        a1.setTitulo("Bom dia pessoal");
        
        l.setAtualizacao(a1);
        l.notificaFa();
        
        
        a1.setNome("Manel Gome");
        a2.setConteudo("Foto dando Joinha enquanto assiste um acidente de moto");
        a2.setLegenda("Eu vou deixar de ser besta");
        a2.setTitulo("Caneta Azul");
        
        l.setAtualizacao(a2);
        l.notificaFa();
        
        
    }
    
}
