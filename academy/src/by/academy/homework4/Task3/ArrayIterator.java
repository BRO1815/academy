package by.academy.homework4.Task3;

 class ArrayIterator<T> {
    private T[] array;

    public void setIndex(int index) {
        this.index = index;
    }

    private int index;

    public ArrayIterator(T[] array) {
        this.array = array;
        index = 0;
    }

    public boolean hasNext() {
        if (index >= array.length) {
            return false;
        }
        return true;
    }

    public T next() {
        try {
            return array[index++];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            return null;
        }

    }

    public void remove() {

        for (int i = index; i + 1 < array.length; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
    }
}
