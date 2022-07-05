package com.co.jarenas98.javatest.util;

public class DateUtil {

    public boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 400 == 0 || year % 100 != 0);
    }
}
