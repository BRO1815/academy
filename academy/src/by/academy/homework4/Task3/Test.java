package by.academy.homework4.Task3;

import java.util.Arrays;

public class Test {
    public static void main(String... args) {

        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayIterator arrayIterator = new ArrayIterator(array);
        System.out.println(Arrays.toString(array));

        while (arrayIterator.hasNext()) {
            System.out.print(arrayIterator.next());

            System.out.print(" ");
        }

        arrayIterator.setIndex(0);
        arrayIterator.remove();
        System.out.println("");

        while (arrayIterator.hasNext()) {
            System.out.print(arrayIterator.next());
            System.out.print(" ");
        }

    }
}
