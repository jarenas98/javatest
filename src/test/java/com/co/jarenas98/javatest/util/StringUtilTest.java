package com.co.jarenas98.javatest.util;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {

    private StringUtil stringUtil;

    @Before
    public void setup() {
        this.stringUtil = new StringUtil();
    }

    @Test
    public void repeat_string_once() {
        assertEquals("Hello", this.stringUtil.repeat("Hello", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        assertEquals("HelloHelloHello", this.stringUtil.repeat("Hello", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        assertEquals("", this.stringUtil.repeat("Hello", 0));
    }

    @Test(expected = NegativeArraySizeException.class)
    public void repeat_string_negative_times() {
        this.stringUtil.repeat("Hello", -3);
    }

    @Test
    public void not_empty_string() {
        assertFalse(this.stringUtil.isEmpty("hola"));
    }

    @Test
    public void empty_string() {
        assertTrue(this.stringUtil.isEmpty(""));
    }

    @Test
    public void null_string() {
        assertTrue(this.stringUtil.isEmpty(null));
    }

    @Test
    public void only_spaces_string() {
        assertTrue(this.stringUtil.isEmpty("  "));
    }
}