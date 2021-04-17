package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements OrderRealization
{
    private List<Product> productList = new ArrayList<>();
    private boolean isAvailable;
    private int index;

    public HealthyShop()
    {
        Product product4 = new Product("Product4", 100);
        Product product5 = new Product("Product5", 60);
        Product product6 = new Product("Product6", 25);

        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public boolean process(Product product) {

        for (int i = 0; i < productList.size(); i ++)
        {
            if (product.getName().equals(productList.get(i).getName()))
            {
                index = i;
                isAvailable = true;
                break;
            }
        }
        if (productList.get(index).getAvailableQuantity() >= product.getAvailableQuantity() && isAvailable)
        {
            System.out.println("We have this product in our shop with required quantity");
            System.out.println();
            return true;
        }
        else if (productList.get(index).getAvailableQuantity() < product.getAvailableQuantity() && isAvailable)
        {
            System.out.println("We have this product in our shop, but with insufficient quantity");
            System.out.println();
            return false;
        }
        System.out.println("Sorry. We do not have this product in our shop");
        System.out.println();
        return false;
    }
}
