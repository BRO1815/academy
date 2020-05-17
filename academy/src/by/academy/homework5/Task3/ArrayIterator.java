package by.academy.homework5.Task3;

import java.util.Iterator;

class ArrayIterator<T> implements Iterator {

    private T[][] array;
    private int indexX;
    private int indexY;

    public T[][] getArray() {
        return array;
    }

    public void setArray(T[][] array) {
        this.array = array;
    }

    public int getIndexX() {
        return indexX;
    }

    public void setIndexX(int indexX) {
        this.indexX = indexX;
    }

    public int getIndexY() {
        return indexY;
    }

    public void setIndexY(int indexY) {
        this.indexY = indexY;
    }

    public ArrayIterator(T[][] array) {
        this.array = array;
        indexX = -1;
        indexY = 0;
    }

    @Override
    public boolean hasNext() {
        if (indexY >= array.length - 1 && indexX >= array[array.length - 1].length - 1) {
            return false;
        }
        return true;
    }

    @Override
    public T next() {
        try {
            if (++indexX < array[indexY].length) {
                return array[indexY][indexX];
            }
            indexX = 0;
            indexY++;
            return array[indexY][indexX];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            return null;
        }
    }
}
