package by.academy.homework5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        String text = "Heavy, isn't it? Heavy is good. Heavy is reliable. If it doesn't work, you can always hit him with it.";
        Map<Character, Integer> frequency = new HashMap<>();
        char symbol = 0;
        for (int i = 0; i < text.length(); i++) {
            symbol = text.charAt(i);
            frequency.put(symbol, frequency.getOrDefault(symbol, 0) + 1);
        }
        System.out.println(frequency.toString());
    }
}
