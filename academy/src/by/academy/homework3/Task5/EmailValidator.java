package by.academy.homework3.Task5;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    @Override
    public boolean validate(String str) {
        String regexp = "^(\\w\\w+)@(\\w\\w+)\\.(\\w\\w+)$";

        if (Pattern.matches(regexp, str)) {
            return true;
        } else {
            return false;
        }
    }
}