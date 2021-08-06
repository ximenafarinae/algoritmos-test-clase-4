package com.example.clase4.shopping;

import com.example.clase4.exceptions.ProductNotFoundException;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private final TestObjectFactory factory = new TestObjectFactory();

    @Test
    public void shoppingMustBeginWithEmptyCart() {
        Cart cart = factory.emptyCart();

        assertEquals(0, cart.getProductQuantity());
    }

    @Test
    public void shoppingCartMustContainABook(){
        Cart cart = factory.emptyCart();
        Product aValidBook = factory.aValidBook();
        cart.addProduct(aValidBook);

        assertTrue(cart.containsProduct(aValidBook));
    }

    @Test
    public void shoppingCartMustContainTwoDifferentBooks() {
        Cart cart = factory.emptyCart();
        Product aValidBook = factory.aValidBook();
        Product anotherValidBook = factory.anotherValidBook();

        cart.addProduct(aValidBook);
        cart.addProduct(anotherValidBook);

        assertTrue(cart.containsProduct(aValidBook));
        assertTrue(cart.containsProduct(anotherValidBook));
        assertTrue(cart.getProductQuantity() >= 2);

    }

    @Test
    public void shoppingCartMustContainCatalogBooks() {
        Cart cart = factory.emptyCart();

        cart.addProductsWithQuantity(factory.aValidBook(), 3);
        assertEquals(3, cart.countOf(factory.aValidBook()));
    }

    @Test
    public void shoppingCartMustNotContainsOutOfCatalogBooks() {
        Cart cart = factory.emptyCart();

        assertThrows(
                ProductNotFoundException.class,
                () -> cart.addProductsWithQuantity(factory.aInvalidBook(),
                        3));
    }

}
