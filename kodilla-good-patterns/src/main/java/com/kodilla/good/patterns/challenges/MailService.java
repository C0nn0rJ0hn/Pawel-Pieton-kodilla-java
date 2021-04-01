package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService
{

    @Override
    public void inform(User user, Order order) {
        System.out.println("Hallo " + user.getName());
        System.out.println("This is your order number: " + order.getOrderNr());
        System.out.println("We received your payment." + "\n" + "Your order is ready and will be shipped tomorrow."
        + "\n" + "Thank You for choosing our shops!");
        System.out.println();
    }
}
