package vvt.trabalho.assert_same;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import vvt.trabalho.UpperLower;

public class UpperLowerReferenceTest {
    @Test
    public void stringToUppercaseByReference() {
        String helloWorld = "HELLO, world!";
        String uppercase = UpperLower.stringToUpperByReference(helloWorld);
        assertSame(
            helloWorld, // expected -   "HELLO, WORLD!"
            uppercase   // actual   -   "HELLO, WORLD!"
            );
    }

    @Test
    public void stringToLowercaseByReference() {
        String helloWorld = "HELLO, world!";
        String lowercase = UpperLower.stringToLowerByReference(helloWorld);
        assertSame(
            "The stringToLowerByReference should return the same String object in lowercase",
            helloWorld, // expected -   "hello, world!"
            lowercase   // actual   -   "hello, world!"
            );
    }
}
