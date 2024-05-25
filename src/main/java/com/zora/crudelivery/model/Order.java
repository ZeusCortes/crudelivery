package com.zora.crudelivery.model;

import java.time.LocalDateTime;
import java.util.List;

public record Order(int id, int customerId, List<Product> productList, Address deliveryAddress,
                    OrderStatus orderStatus, float totalPrice, LocalDateTime dateTime) {
    public void calculateTotalPrice(){
    }
    public void updateStatus(){
    }
    public void assignDeliveryPerson(){
    }
}
