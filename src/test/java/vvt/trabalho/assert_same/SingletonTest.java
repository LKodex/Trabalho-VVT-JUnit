package vvt.trabalho.assert_same;

import static org.junit.Assert.assertSame;

import org.junit.Ignore;
import org.junit.Test;

import vvt.trabalho.Singleton;

public class SingletonTest {
    @Test
    public void testGoodSingleton() {
        Singleton firstSingleton = Singleton.getInstanceGoodImpl();
        Singleton secondSingleton = Singleton.getInstanceGoodImpl();
        assertSame(
            "The getInstance method of a singleton class should return the same object instance.",
            firstSingleton, // expected
            secondSingleton // actual
            );
    }
    
    @Ignore
    @Test
    public void testBadSingleton() {
        Singleton firstSingleton = Singleton.getInstanceBadImpl();
        Singleton secondSingleton = Singleton.getInstanceBadImpl();
        assertSame(
            firstSingleton, // expected
            secondSingleton // actual
            );
    }
}
