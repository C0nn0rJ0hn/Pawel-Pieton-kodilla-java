package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements OrderRealization
{
    private List<Product> productList = new ArrayList<>();
    private boolean productAvailable;

    public ExtraFoodShop()
    {
        Product product1 = new Product("Product1", 50);
        Product product2 = new Product("Product2", 80);
        Product product3 = new Product("Product3", 30);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public boolean process(Product product) {
        for (int i = 0; i < productList.size(); i ++) {
            if (productList.get(i).getName().equals(product.getName()) && productList.get(i).getAvailableQuantity() >= product.getAvailableQuantity()) {
                System.out.println("We have this product in our shop with required quantity");
                System.out.println();
                productAvailable = true;
            } else if (productList.get(i).getName().equals(product.getName()) && productList.get(i).getAvailableQuantity() < product.getAvailableQuantity()) {
                System.out.println("We have this product in our shop, but with insufficient quantity");
                System.out.println();
                productAvailable = false;
            }
            else {
                System.out.println("Sorry. We do not have this product in our shop");
                System.out.println();
                productAvailable = false;
            }
        }
        return productAvailable;
    }
}
