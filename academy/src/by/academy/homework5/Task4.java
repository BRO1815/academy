package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> arrayList = new ArrayList<>();

        int i = 0;
        while (i++ < 15) {
            arrayList.add(rand.nextInt(11));
        }

        Iterator iter = arrayList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" ");
        }

        System.out.print("\nСамая высокая оценка: ");
        iter = arrayList.iterator();
        int max = 0;
        Integer next = 0;
        while (iter.hasNext()) {
            next = (Integer) iter.next();
            if (max < next) {
                max = next;
            }
        }
        System.out.print(max);
    }
}
