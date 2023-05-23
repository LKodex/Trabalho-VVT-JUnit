package vvt.trabalho;
import static org.junit.Assert.*;

import org.junit.Test;



public class ContaTest {

    
    
    @Test
    public void testSacaFalso(){
        Conta cc = new Conta(1,"lucas");
        cc.deposita(200);
        cc.setLimite(100);
        boolean recebido = cc.saca(400);
        assertFalse(recebido);

    }
    @Test
    public void testSacaTrue(){
        Conta cc = new Conta(1,"lucas");
        cc.deposita(200);
        cc.setLimite(100);
        boolean recebido = cc.saca(300);
        String message = "Este teste deveria dar verdadeiro caso o cliente tente sacar um valor menor ou igual que seu saldo somado ao seu limite";
        assertTrue(message ,recebido);

    }
    
    @Test
    public void testContaNaoNuloObjeto(){
        Conta cc = new Conta(1,"lucas");
        assertNotNull(cc);

    }
    
    @Test
    public void testContaObjetoNulo(){
        Conta cc = null;
        assertNull(cc);
    }

    @Test
    public void testContaMetodoNulo(){
        assertNull(Conta.criarContaFilho(1, "lucas", null, 1000));
    }

    @Test
    public void testContaMetodoNaoNulo(){
        Conta c1 = new Conta(1, "lucas");
        assertNotNull(Conta.criarContaFilho(1, "alexandre", c1, 1000));

    
    }

}
