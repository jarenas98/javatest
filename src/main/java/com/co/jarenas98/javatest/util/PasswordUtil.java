package com.co.jarenas98.javatest.util;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    public SecurityLevel assesPassword(String password) {
        SecurityLevel securityLevel;

        if (password.length() < 8 || password.matches("[a-zA-Z]+")) {
            securityLevel = SecurityLevel.WEAK;
        } else if (password.matches("[a-zA-Z0-9]+")) {
            securityLevel = SecurityLevel.MEDIUM;
        } else {
            securityLevel = SecurityLevel.STRONG;
        }

        return securityLevel;
    }
}
