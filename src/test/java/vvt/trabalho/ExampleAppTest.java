package vvt.trabalho;

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
}
