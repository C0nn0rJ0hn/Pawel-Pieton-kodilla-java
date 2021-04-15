package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor
{
    private OrderRealization orderRealization;
    private Order order;

    public OrderProcessor(OrderRealization orderRealization, Order order) {
        this.orderRealization = orderRealization;
        this.order = order;
    }

    public boolean executeOrder()
    {
        boolean orderInProgress = orderRealization.process(order.getProduct());
        if (orderInProgress)
        {
            System.out.println("All your products are available. This is your order number: " + order.getOrderNr() +
                    "\n" + "We will sent you another message when we ship your order to you.");
        }
        else
        {
            System.out.println("We can not complete your order");
        }
        return orderInProgress;
    }
}
