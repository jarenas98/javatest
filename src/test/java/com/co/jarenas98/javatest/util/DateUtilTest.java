package com.co.jarenas98.javatest.util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DateUtilTest {

    private DateUtil dateUtil = new DateUtil();

    @Test
    public void leap_year_should_return_true_when_year_is_divisible_by_400() {
        assertThat(this.dateUtil.isLeapYear(1600), is(true));
        assertThat(this.dateUtil.isLeapYear(2000), is(true));
        assertThat(this.dateUtil.isLeapYear(2400), is(true));
    }

    @Test
    public void leap_year_should_return_false_when_year_is_divisible_by_100_but_not_by_400() {
        assertThat(this.dateUtil.isLeapYear(1700), is(false));
        assertThat(this.dateUtil.isLeapYear(1800), is(false));
        assertThat(this.dateUtil.isLeapYear(1900), is(false));
    }

    @Test
    public void leap_year_should_return_true_when_year_is_divisible_by_4_but_not_by_100() {
        assertThat(this.dateUtil.isLeapYear(1996), is(true));
        assertThat(this.dateUtil.isLeapYear(2004), is(true));
        assertThat(this.dateUtil.isLeapYear(2008), is(true));
    }

    @Test
    public void leap_year_should_return_false_when_year_is_not_divisible_by_4() {
        assertThat(this.dateUtil.isLeapYear(2017), is(false));
        assertThat(this.dateUtil.isLeapYear(2018), is(false));
        assertThat(this.dateUtil.isLeapYear(2019), is(false));
    }
}