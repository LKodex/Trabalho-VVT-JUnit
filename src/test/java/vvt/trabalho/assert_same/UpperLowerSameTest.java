package vvt.trabalho.assert_same;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import vvt.trabalho.CustomString;

public class UpperLowerSameTest {
    @Test
    public void originalStringToUppercase() {
        CustomString helloWorld = new CustomString("HELLO, world!");
        CustomString uppercase = helloWorld.toUpper();
        assertSame(
            helloWorld, // expected     -   "HELLO, WORLD!"
            uppercase   // actual       -   "HELLO, WORLD!"
        );
    }

    @Test
    public void originalStringToLowercase() {
        CustomString helloWorld = new CustomString("HELLO, world!");
        CustomString lowercase = helloWorld.toLower();
        assertSame(
            "The toLower should return the same CustomString object in lowercase",
            helloWorld, // expected     -   "hello, world!"
            lowercase   // actual       -   "hello, world!"
        );
    }
}
