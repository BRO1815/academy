package by.academy.homework3.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {

        Text1 txt = new Text1();
        String str = txt.getStr();
        String regexp = "(\\b[A-Ca-c]\\w*)";
        StringBuilder result = new StringBuilder();

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            result.append(matcher.group()+" ");
        }
        System.out.println(result);
    }
}


