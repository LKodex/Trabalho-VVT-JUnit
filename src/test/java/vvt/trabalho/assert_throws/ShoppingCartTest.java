package vvt.trabalho.assert_throws;

import static org.junit.Assert.assertThrows;

import org.junit.Ignore;
import org.junit.Test;

import vvt.trabalho.ShoppingCart;

public class ShoppingCartTest {
    @Test
    public void insertExistentProduct() {
        ShoppingCart cart = new ShoppingCart();
        Object productA = new Object();
        cart.insert(productA);
        assertThrows(IllegalArgumentException.class, () -> {
            cart.insert(productA); // throws IllegalArgumentException
        });
    }
    
    @Test
    public void removeUnexistentProduct() {
        ShoppingCart cart = new ShoppingCart();
        Object productA = new Object();
        assertThrows(IllegalArgumentException.class, () -> {
            cart.remove(productA); // throws IllegalArgumentException
        });
    }

    @Ignore
    @Test
    public void removeExistentProduct() {
        ShoppingCart cart = new ShoppingCart();
        Object productA = new Object();
        assertThrows(IllegalArgumentException.class, () -> {
            cart.insert(productA); // doesn't throws any exception
        });
    }

    @Ignore
    @Test
    public void insertUnexistentProduct() {
        ShoppingCart cart = new ShoppingCart();
        Object productA = new Object();
        assertThrows(IllegalArgumentException.class, () -> {
            cart.insert(productA); // doesn't throws any exception
        });
    }
}
