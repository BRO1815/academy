package by.academy.homework5.Task3;

public class Test {
    public static void main(String... args) {
        Integer[][] array = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5, 6}};
        ArrayIterator arrayIterator = new ArrayIterator(array);
        while (arrayIterator.hasNext()) {
            if (arrayIterator.getIndexX() == array[arrayIterator.getIndexY()].length - 1) {
                System.out.println();
            }
            System.out.print(arrayIterator.next());
            System.out.print(" ");
        }
    }
}
