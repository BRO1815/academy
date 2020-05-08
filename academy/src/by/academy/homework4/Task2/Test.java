package by.academy.homework4.Task2;

import java.util.Arrays;

public class Test {
    public static void main(String... args) {

        Task2<String> task = new Task2<String>();
        System.out.println(Arrays.toString(task.getArray()));

        Task2<String> task2 = new Task2<String>(5);
        System.out.println(Arrays.toString(task2.getArray()));

        String[] testArray = new String[]{"A","B","C"};
        task.setArray(testArray);

        System.out.println(Arrays.toString(task.getArray()));
        System.out.print("1) ");
        task.add(null);
        System.out.println(Arrays.toString(task.getArray()));
        task.add("C");
        task.add("D");
        System.out.println(Arrays.toString(task.getArray()));
        System.out.print("2) ");
        System.out.println(task.get(2));
        System.out.print("3) ");
        System.out.println(task.getLast());
        System.out.print("4) ");
        System.out.println(task.getFirst());
        System.out.print("5) ");
        task.arrayLength();
        System.out.print("6) ");
        System.out.println(task.getIndexLastObj());
        System.out.print("7) ");
        task.remove(1);
        System.out.println(Arrays.toString(task.getArray()));
        System.out.print("8) ");
        task.remove("C");
        System.out.println(Arrays.toString(task.getArray()));

    }
}
