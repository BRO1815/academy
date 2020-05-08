package by.academy.homework4.Task2;

import java.util.Arrays;

public class Task2<T> {

    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public Task2() {
        @SuppressWarnings("unchecked")
        T[] array = (T[]) new Object[16];
        this.array = array;
    }

    public Task2(int arrayLength) {
        @SuppressWarnings("unchecked")
        T[] array = (T[]) new Object[arrayLength];
        this.array = array;
    }


    public T get(int index) {
        if (index<array.length)
        return array[index];
        return  null;
    }

    public T getLast() {
        return array[array.length - 1];
    }

    public T getFirst() {
        return array[0];
    }

    public void arrayLength() {
        System.out.println(array.length);
    }

    public void add(T obj) {
        int index = getIndexLastObj() + 1;
        if (index == array.length) {
            T[] arrayCopy = Arrays.copyOf(array, array.length + 1);
            array = arrayCopy;
        }
        array[index]=obj;
    }

    public int getIndexLastObj() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                return (i - 1);
        }
        return array.length - 1;
    }

    public void remove(int index) {

        for (int i = index; i + 1 < array.length; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
    }

    public void remove(T obj) {
        int z = 0;
        for (int i = 0; i <= array.length; i++) {
            if (i == array.length) {
                if (z == 0) {
                    System.out.println("Совпадений нет");
                }
                System.out.print("Удалено элементов: ");
                System.out.println(z);
                break;
            }
            if (array[i] != null && array[i].equals(obj)) {
                for (int x = i; x + 1 < array.length; x++) {
                    array[x] = array[x + 1];
                }
                array[array.length - 1] = null;
                z++;
                i--;
            }
        }
    }
}

