package com.co.jarenas98.javatest.dices;

import java.util.Random;

public class Dice {

    private int sides;


    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return new Random().nextInt(this.sides) + 1;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
