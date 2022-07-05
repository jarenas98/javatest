package com.co.jarenas98.javatest.util;

public class StringUtil {
    public String repeat(String text, int times) {
        return new String(new char[times]).replace("\0", text);
    }

    public boolean isEmpty(String str) {
        return str == null ? true : false || str.trim().isEmpty() ? true : false;
    }
}
