package com.zora.crudelivery.model;

import java.util.List;

public class Menu {
    List<Product> productList;
    public List<Product> getMenu() {
        return productList;
    }
    public void addProduct(Product product){

    }
    public boolean removeProduct(Product product){
        return false;
    }
}
