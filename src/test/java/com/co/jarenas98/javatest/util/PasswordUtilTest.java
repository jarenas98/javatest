package com.co.jarenas98.javatest.util;

import org.junit.Test;

import static com.co.jarenas98.javatest.util.PasswordUtil.SecurityLevel;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    private PasswordUtil passwordUtil = new PasswordUtil();

    @Test
    public void weak_when_has_less_than_8_characters() {
        assertEquals(SecurityLevel.WEAK, this.passwordUtil.assesPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(SecurityLevel.WEAK, this.passwordUtil.assesPassword("fgasdfgjkl"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(SecurityLevel.MEDIUM, this.passwordUtil.assesPassword("fgasd2345"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(SecurityLevel.STRONG, this.passwordUtil.assesPassword("fgasd2345!"));
    }
}