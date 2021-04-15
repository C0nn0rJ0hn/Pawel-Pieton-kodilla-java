package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDateTime;

public class OrderRequestRetriever
{
    public OrderRequest retrieve()
    {
        User user = new User("John", "Connor");

        LocalDateTime orderTime = LocalDateTime.of(2021, 4, 1, 14, 0, 25);

        Product orderedProduct = new Product("PC_Game", "CD Project RED", "The Witcher - Wild Hunt", 20124, 1);

        Order order = new Order(123456778);

        return new OrderRequest(user, orderTime, orderedProduct, order);
    }
}
