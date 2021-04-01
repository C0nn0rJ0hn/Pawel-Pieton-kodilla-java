package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService
{

    @Override
    public boolean order(User user, LocalDateTime orderTime, Product orderedProduct, Order order) {

        System.out.println("Order for: " + user.getName() + " " + user.getSurname());
        System.out.println("Order details: " + "\n" +
                "Product Type: " + orderedProduct.getProductType() + "\n" +
                "Product Mark: " + orderedProduct.getMark() + "\n" +
                "Product Name: " + orderedProduct.getProductName() + "\n" +
                "Product ID: " + orderedProduct.getProductId() + "\n" +
                "Quantity: " + orderedProduct.getQuantity());
        System.out.println();

        return true;
    }
}
