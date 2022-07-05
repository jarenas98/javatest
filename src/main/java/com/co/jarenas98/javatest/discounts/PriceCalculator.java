package com.co.jarenas98.javatest.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices;
    private double discount;

    public PriceCalculator() {
        this.prices = new ArrayList<>();
        this.discount = 0.0;
    }

    public double getTotal() {
        double total = 0.0;

        for (Double price : this.prices) {
            total += price;
        }

        return total - (total*(discount/100));
    }

    public void addPrice(double newPrice) {
        this.prices.add(newPrice);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
