package by.academy.homework3.Task5;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
    @Override
    public boolean validate(String str) {
        String regexp = "(^\\+375\\d{9}$)";

        if (Pattern.matches(regexp, str)) {
            return true;
        } else {
            return false;
        }
    }
}