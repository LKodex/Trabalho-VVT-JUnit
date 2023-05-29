package vvt.trabalho.assert_not_same;

import static org.junit.Assert.assertNotSame;

import org.junit.Test;

import vvt.trabalho.CustomString;

public class UpperLowerNotSameTest {
    @Test
    public void stringCopyToUppercase() {
        CustomString helloWorld = new CustomString("HELLO, world!");
        CustomString uppercase = helloWorld.copyAndUpper();
        assertNotSame(
            "The copyAndUpper should return a new CustomString object in uppercase",
            helloWorld, // unexpected   -   "HELLO, world!"
            uppercase   // actual       -   "HELLO, WORLD!"
        );
    }

    @Test
    public void stringCopyToLowercase() {
        CustomString helloWorld = new CustomString("HELLO, world!");
        CustomString lowercase = helloWorld.copyAndLower();
        assertNotSame(
            helloWorld, // unexpected   -   "HELLO, world!"
            lowercase   // actual       -   "hello, world!"
        );
    }
}
