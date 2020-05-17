package by.academy.homework5;

public class Task6 {
    public static void main(String[] args) {

        int[] array = new int[8];
        int i = 0;
        try {
            while (i < 10) {
                array[i] = i++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array is to small, expand the array");
        }
    }
}
