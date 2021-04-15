package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDateTime;

public interface OrderRepository
{
    boolean createOrder(User user, LocalDateTime orderTime, Product orderedProduct, Order order);
}
