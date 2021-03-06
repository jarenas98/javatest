package com.co.jarenas98.javatest.dices;

public class Player {

    private Dice dice;
    private int minNumberToWin;

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    public boolean play() {
        int diceNumber = this.dice.roll();
        return diceNumber >= this.minNumberToWin;
    }
}
