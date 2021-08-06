package com.example.clase4.shopping;

import java.util.Objects;

public class Product {

    String productName;
    Double price;

    public Product(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        final Product other = (Product) obj;
        return Objects.equals(this.productName, other.productName);
    }
}
