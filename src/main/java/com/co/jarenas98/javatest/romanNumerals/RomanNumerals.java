package com.co.jarenas98.javatest.romanNumerals;

public class RomanNumerals {

    public String arabicToRoman(int n) {
        String romano = "";

        int miles = n / 1000;
        int centenas = n / 100 % 10;
        int decenas = n / 10 % 10;
        int unidades = n % 10;

        for (int i = 0; i < miles; i++) {
            romano += "M";
        }

        if (centenas == 9) {
            romano += "CM";
        } else if (centenas >= 5) {
            romano += "D";
            for (int i = 6; i <= centenas; i++) {
                romano += "C";
            }
        } else if (centenas == 4) {
            romano += "CD";
        } else {
            for (int i = 0; i < centenas; i++) {
                romano += "C";
            }
        }

        if (decenas == 9) {
            romano += "XC";
        } else if (decenas >= 5) {
            romano = romano + "L";
            for (int i = 6; i <= decenas; i++) {
                romano += "X";
            }
        } else if (decenas == 4) {
            romano += "XL";
        } else {
            for (int i = 0; i < decenas; i++) {
                romano += "X";
            }
        }

        if (unidades == 9) {
            romano += "IX";
        } else if (unidades >= 5) {
            romano += "V";
            for (int i = 6; i <= unidades; i++) {
                romano += "I";
            }
        } else if (unidades == 4) {
            romano += "IV";
        } else {
            for (int i = 0; i < unidades; i++) {
                romano += "I";
            }
        }


        return romano;
    }
}
