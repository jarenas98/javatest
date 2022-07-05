package com.co.jarenas98.javatest.discounts;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class PriceCalculatorTest {

    private PriceCalculator priceCalculator;

    @Before
    public void setup() {
        this.priceCalculator = new PriceCalculator();
    }

    @Test
    public void total_zero_when_there_are_not_prices() {
        assertThat(this.priceCalculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_sum_of_prices() {
        this.priceCalculator.addPrice(10.0);
        this.priceCalculator.addPrice(15.5);

        assertThat(this.priceCalculator.getTotal(), is(25.5));
    }

    @Test
    public void total_is_sum_of_prices_and_apply_discount() {
        this.priceCalculator.addPrice(12.0);
        this.priceCalculator.addPrice(18.2);

        this.priceCalculator.setDiscount(25);

        assertThat(this.priceCalculator.getTotal(), is(22.65));
    }
}