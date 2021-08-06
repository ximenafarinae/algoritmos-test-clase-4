package com.example.clase4.shopping;

import java.util.ArrayList;
import java.util.List;

public class TestObjectFactory {

    Cart emptyCart() {
        return new Cart(catalogWithValidBooks());
    }

    List<Product> catalogWithValidBooks() {
        List<Product> catalog = new ArrayList<>();
        catalog.add(aValidBook());
        catalog.add(anotherValidBook());
        return catalog;
    }

    Product aValidBook() {
        return new Product("VALID_BOOK", 100.00);
    }

    Product anotherValidBook() {
        return new Product("ANOTHER_VALID_BOOK", 300.00);
    }

    Product aInvalidBook() {
        return new Product("INVALID_BOOK", 0.00);
    }
}
