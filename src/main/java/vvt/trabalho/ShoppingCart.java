package vvt.trabalho;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Object> cartProducts;

    public ShoppingCart() {
        cartProducts = new ArrayList<>();
    }

    public void insert(Object product) {
        if (cartProducts.contains(product)) throw new IllegalArgumentException();
        cartProducts.add(product);
    }

    public void remove(Object product) {
        Boolean produtoNaoFoiRemovido = !cartProducts.remove(product);
        if (produtoNaoFoiRemovido) throw new IllegalArgumentException();
    }
}