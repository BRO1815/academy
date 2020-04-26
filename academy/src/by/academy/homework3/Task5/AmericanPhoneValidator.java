package by.academy.homework3.Task5;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
    @Override
    public boolean validate(String str) {
        String regexp = "(^\\+1\\d{10}$)";


        if (Pattern.matches(regexp, str)) {
            return true;
        } else {
            return false;
        }
    }
}
