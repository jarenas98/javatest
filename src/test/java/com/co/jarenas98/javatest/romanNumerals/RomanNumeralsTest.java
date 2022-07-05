package com.co.jarenas98.javatest.romanNumerals;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {

    @Test
    public void return_the_correct_roman_number() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("I", romanNumerals.arabicToRoman(1));
        assertEquals("II", romanNumerals.arabicToRoman(2));
        assertEquals("III", romanNumerals.arabicToRoman(3));
        assertEquals("IV", romanNumerals.arabicToRoman(4));
        assertEquals("V", romanNumerals.arabicToRoman(5));
        assertEquals("VI", romanNumerals.arabicToRoman(6));
        assertEquals("VII", romanNumerals.arabicToRoman(7));
        assertEquals("VIII", romanNumerals.arabicToRoman(8));
        assertEquals("IX", romanNumerals.arabicToRoman(9));
        assertEquals("X", romanNumerals.arabicToRoman(10));
        assertEquals("XI", romanNumerals.arabicToRoman(11));
        assertEquals("XV", romanNumerals.arabicToRoman(15));
        assertEquals("XVI", romanNumerals.arabicToRoman(16));
        assertEquals("L", romanNumerals.arabicToRoman(50));
        assertEquals("LI", romanNumerals.arabicToRoman(51));
        assertEquals("LIV", romanNumerals.arabicToRoman(54));
        assertEquals("LV", romanNumerals.arabicToRoman(55));
        assertEquals("LVI", romanNumerals.arabicToRoman(56));
        assertEquals("LX", romanNumerals.arabicToRoman(60));
        assertEquals("LXX", romanNumerals.arabicToRoman(70));
        assertEquals("LXXX", romanNumerals.arabicToRoman(80));
        assertEquals("LXXXI", romanNumerals.arabicToRoman(81));
        assertEquals("LXXXV", romanNumerals.arabicToRoman(85));
        assertEquals("LXXXVI", romanNumerals.arabicToRoman(86));
        assertEquals("CXXVI", romanNumerals.arabicToRoman(126));
        assertEquals("MMDVII", romanNumerals.arabicToRoman(2507));
        assertEquals("XCIX", romanNumerals.arabicToRoman(99));
        assertEquals("CD", romanNumerals.arabicToRoman(400));
        assertEquals("CM", romanNumerals.arabicToRoman(900));

    }
}