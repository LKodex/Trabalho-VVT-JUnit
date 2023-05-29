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

    @Test
    public void upperStringCopyWithSameContent() {
        CustomString helloWorld = new CustomString("HELLO, world!");
        CustomString uppercase = helloWorld.copyAndUpper();
        helloWorld.toUpper();
        assertNotSame(
            "An object instance should not be the same as an object with equal content",
            helloWorld, // unexpected   -   "HELLO, WORLD!"
            uppercase   // actual       -   "HELLO, WORLD!"
        );
    }

    @Test
    public void lowerStringCopyWithSameContent() {
        CustomString helloWorld = new CustomString("HELLO, world!");
        CustomString lowercase = helloWorld.copyAndLower();
        helloWorld.toLower();
        assertNotSame(
            helloWorld, // unexpected   -   "HELLO, WORLD!"
            lowercase   // actual       -   "HELLO, WORLD!"
        );
    }
}
