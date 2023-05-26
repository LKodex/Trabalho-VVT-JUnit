package vvt.trabalho.assert_not_same;

import static org.junit.Assert.assertNotSame;

import org.junit.Test;

import vvt.trabalho.UpperLower;

public class UpperLowerCopyTest {
    @Test
    public void stringCopyToUppercase() {
        String helloWorld = "HELLO, world!";
        String uppercase = UpperLower.stringCopyToUpper(helloWorld);
        assertNotSame(
            "The stringCopyToUpper should return a new String object in uppercase",
            helloWorld, // unexpected   -   "HELLO, world!"
            uppercase   // actual       -   "HELLO, WORLD!"
            );
    }

    @Test
    public void stringCopyToLowercase() {
        String helloWorld = "HELLO, world!";
        String lowercase = UpperLower.stringCopyToLower(helloWorld);
        assertNotSame(
            helloWorld, // unexpected   -   "HELLO, world!"
            lowercase   // actual       -   "hello, world!"
            );
    }
}
