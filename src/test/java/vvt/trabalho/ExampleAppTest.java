package vvt.trabalho;

import org.junit.Ignore;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ExampleAppTest extends TestCase {
    public ExampleAppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(ExampleAppTest.class);
    }

    /*
     * Comandos:
     * - assertTrue
     * - assertFalse
     * - assertNull
     * - assertNotNull
     * - assertSame
     * - assertNotSame
     * - assertEquals
     *
     * Outros comandos:
     * - fail
     * - failSame
     * - failNotSame
     * - failNotEquals
     */

    public void testAssertTrue() {
        assertTrue(true);
    }

    public void testAssertFalse() {
        assertFalse(false);
    }

    public void testAssertNull() {
        assertNull(null);
    }

    public void testAssertNotNull() {
        assertNotNull(new Object());
    }

    public void testAssertSame() {
        Object newObjectReference = new Object();
        Object sameObjectReference = newObjectReference;
        assertSame(newObjectReference, sameObjectReference);
    }

    public void testAssertNotSame() {
        Object object = new Object();
        Object differentObject = new Object();
        assertNotSame(object, differentObject);
    }

    public void testAssertEquals() {
        // Tipo Object das variáveis podem ser
        // substituídos por String sem problemas
        Object object = new String(" string ");
        Object differentObject = new String(" string ");
        assertEquals(object, differentObject);
    }

    
    public void testSacaFalso(){
        Conta cc = new Conta(1,"lucas");
        cc.deposita(200);
        cc.setLimite(100);
        boolean recebido = cc.saca(400);
        assertFalse(recebido);

    }

    public void testSacaTrue(){
        Conta cc = new Conta(1,"lucas");
        cc.deposita(200);
        cc.setLimite(100);
        boolean recebido = cc.saca(300);
        String message = "Este teste deveria dar verdadeiro caso o cliente tente sacar um valor menor ou igual que seu saldo somado ao seu limite";
        assertTrue(message ,recebido);

    }

    public void testContaNaoNuloObjeto(){
        Conta cc = new Conta(1,"lucas");
        assertNotNull(cc);

    }

    public void testContaObjetoNulo(){
        Conta cc = null;
        assertNull(cc);
    }

    public void testContaMetodoNulo(){
        assertNull(Conta.criarContaFilho(1, "lucas", null, 1000));
    }

    public void testContaMetodoNaoNulo(){
        Conta c1 = new Conta(1, "lucas");
        assertNotNull(Conta.criarContaFilho(1, "alexandre", c1, 1000));

    }



}
