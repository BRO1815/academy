package by.academy.homework5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Task1 {
    public static void main(String... arg) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("A");
        arrayList.add("D");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        arrayList.add("D");
        System.out.println(removeDuplicate(arrayList));
    }

    public static <T> Collection removeDuplicate(Collection<T> collection) {
        Collection<T> set = new HashSet<>();
        set.addAll(collection);
        return set;
    }
}