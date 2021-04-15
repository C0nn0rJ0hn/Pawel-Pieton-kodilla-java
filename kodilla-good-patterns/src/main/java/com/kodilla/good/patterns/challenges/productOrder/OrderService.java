package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDateTime;

public interface OrderService
{
    boolean order (User user, LocalDateTime orderTime, Product orderedProduct, Order order);
}
