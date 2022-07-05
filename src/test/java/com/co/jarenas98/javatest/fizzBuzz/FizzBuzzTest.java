package com.co.jarenas98.javatest.fizzBuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

//    Si el número es divisible por 3, retorna “Fizz”
//    Si el número es divisible por 5, retorna “Buzz”
//    Si el número es divisible por 3 y por 5, retorna “FizzBuzz”
//    En otro caso, retorna el mismo número

    private FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizBuzz_should_return_fizz_if_number_is_divisible_by_3() {
        assertEquals("Fizz", this.fizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", this.fizzBuzz.fizzBuzz(6));
    }

    @Test
    public void fizBuzz_should_return_buzz_if_number_is_divisible_by_5() {
        assertEquals("Buzz", this.fizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", this.fizzBuzz.fizzBuzz(10));
    }

    @Test
    public void fizBuzz_should_return_fizzbuzz_if_number_is_divisible_by_5_and_by_3() {
        assertEquals("FizzBuzz", this.fizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", this.fizzBuzz.fizzBuzz(30));
    }
}