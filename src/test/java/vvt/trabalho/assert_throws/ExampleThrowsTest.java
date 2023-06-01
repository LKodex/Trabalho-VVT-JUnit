package vvt.trabalho.assert_throws;

import static org.junit.Assert.assertThrows;

import org.junit.Ignore;
import org.junit.Test;

public class ExampleThrowsTest {
    @Test
    public void exampleA() {
        assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException();
        });
    }

    @Test
    public void exampleB() {
        assertThrows(RuntimeException.class, () -> {
            throw new IllegalArgumentException();
        });
    }

    @Test
    public void exampleC() {
        assertThrows(Exception.class, () -> {
            throw new IllegalArgumentException();
        });
    }
    @Test
    public void exampleD() {
        assertThrows(Throwable.class, () -> {
            throw new IllegalArgumentException();
        });
    }

    @Ignore
    @Test
    public void exampleE() {
        assertThrows(IllegalArgumentException.class, () -> {
            throw new RuntimeException();
        });
    }
}
