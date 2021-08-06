package com.example.clase4.shopping;

import com.example.clase4.exceptions.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    public List<Product> catalog;
    public List<Product> productList = new ArrayList<>();

    public Cart(List<Product> catalog) {
        this.catalog = catalog;
    }

    public void addProductsWithQuantity(Product product, int quantity) {
        assertValidProductQuantity(quantity);

        int i = 0;
        while (i < quantity) {
            addProduct(product);
            i++;
        }
    }

    public void addProduct(Product product) {
        assertValidProduct(product);
        this.productList.add(product);
    }

    public Boolean containsProduct(Product product) {
        return productList.contains(product);
    }

    public long countOf(Product product) {
        return productList
                .stream()
                .filter(p -> p.productName.equals(product.productName))
                .count();
    }

    public int getProductQuantity() {
        return productList.size();
    }

    public void assertValidProduct(Product product) {
        if (!catalog.contains(product)) {
            throw new ProductNotFoundException(ErrorMessage.NOT_VALID_PRODUCT_EXCEPTION.getMessage());
        }
    }

    public void assertValidProductQuantity(int quantity) {
        if (quantity < 0) {
            throw new ProductNotFoundException(ErrorMessage.NOT_VALID_PRODUCT_QUANTITY_EXCEPTION.getMessage());
        }
    }
}
