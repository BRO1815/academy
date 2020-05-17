package by.academy.homework5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long time1 = System.currentTimeMillis();
        select1_000_000(arrayList);
        long time2 = System.currentTimeMillis();
        select1_000_000(linkedList);
        long time3 = System.currentTimeMillis();

        System.out.println(" Время затраченное на arrayList: " + (time2 - time1));
        System.out.println(" Время затраченное на linkedList: " + (time3 - time2));
    }

    public static void select1_000_000(List list) {
        Random rand = new Random();
        int size = list.size();
        for (int i = 0; i < 100_000; i++) {
            list.get(rand.nextInt(size));
        }
    }
}
