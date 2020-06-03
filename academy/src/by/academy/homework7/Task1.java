package by.academy.homework7;

import java.util.List;
import java.util.stream.Stream;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Map;

public class Task1 {
    public static void main(String[] arg) {

        List<Long> longList = Stream.generate(() -> (long) new Random().nextInt(101)).limit(100).map(i -> (long)(i * Math.PI - 20)).filter(i -> i < 100).sorted().skip(3).collect(Collectors.toList());
        System.out.println(longList.toString());

        Map<String, Long> longMap = longList.stream().distinct().collect(Collectors.toMap(i -> "Number:" + i, (i) -> i.longValue()));
        System.out.println("------ Map ------");
        System.out.println(longMap.toString());

        List<String> StringList = longMap.keySet().stream().collect(Collectors.toList());
        System.out.println("------ List ------");
        System.out.println(StringList.toString());

    }
}
