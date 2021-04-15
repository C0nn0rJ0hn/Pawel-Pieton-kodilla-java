package com.kodilla.good.patterns.challenges.food2door;

import java.util.Random;

public class OrderGenerator
{
    public Order retrieve()
    {
        User user = new User("John", "Connor");
        Product product = new Product("Product2", 30);
        Contractor contractor = new Contractor("Extra Food Shop", "ul. Zakopianska 18, Krakow");
        Random r = new Random();
        int orderNumber = r.nextInt(10000);

        return new Order(user, contractor, product, orderNumber);
    }

    public Order retrieve2()
    {
        User user = new User("John", "Connor");
        Product product = new Product("Product5", 100);
        Contractor contractor = new Contractor("Healthy Shop", "ul. Gdanska 25, Gdynia");
        Random r = new Random();
        int orderNumber = r.nextInt(10000);

        return new Order(user, contractor, product, orderNumber);
    }
}
