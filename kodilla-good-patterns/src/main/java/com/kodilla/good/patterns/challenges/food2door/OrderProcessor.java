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
                    "\n" + "We will sent you another message when we ship your order to you." + "\n" +
                    "Please check your order details:" + "\n" + "Order for: " + order.getUser().getName() + " " + order.getUser().getSurname() + "\n" +
                    "Ordered product: " + order.getProduct().getName() + " , quantity: " + order.getProduct().getAvailableQuantity() + "\n" +
                    "Shop from which you will receive your order: " + order.getContractor().getShopName());
            System.out.println();
            System.out.println();
        }
        else
        {
            System.out.println("We can not complete your order");
            System.out.println();
            System.out.println();
        }
        return orderInProgress;
    }
}
