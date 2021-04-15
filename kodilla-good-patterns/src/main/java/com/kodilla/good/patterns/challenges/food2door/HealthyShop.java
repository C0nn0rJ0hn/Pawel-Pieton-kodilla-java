package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements OrderRealization
{
    private List<Product> productList = new ArrayList<>();
    private boolean productAvailable;

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
            if (productList.get(i).getName().equals(product.getName()) && productList.get(i).getAvailableQuantity() >= product.getAvailableQuantity())
            {
                System.out.println("We have this product in our shop with required quantity");
                System.out.println();
                productAvailable = true;
            }
            else if (productList.get(i).getName().equals(product.getName()) && productList.get(i).getAvailableQuantity() < product.getAvailableQuantity())
            {
                System.out.println("We have this product in our shop, but with insufficient quantity");
                System.out.println();
                productAvailable = false;
            }
            else
            {
                System.out.println("Sorry. We do not have this product in our shop");
                System.out.println();
                productAvailable = false;
            }
        }
        return productAvailable;
    }
}
