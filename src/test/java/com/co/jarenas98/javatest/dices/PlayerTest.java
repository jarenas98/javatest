package com.co.jarenas98.javatest.dices;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void looses_when_dice_number_is_too_low() {

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice, 5);

        assertFalse(player.play());
    }

    @Test
    public void win_when_dice_number_is_large() {

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(5);
        Player player = new Player(dice, 5);

        assertTrue(player.play());
    }
}