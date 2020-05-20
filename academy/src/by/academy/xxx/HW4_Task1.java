package by.academy.xxx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class HW4_Task1 {
    public static void main(String... arg) {
        List<String> arrayList = new ArrayList<>();
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
        Collection<T> coll = collection;
        Iterator<T> iterator = coll.iterator();
        Iterator<T> iterator2 = coll.iterator();
        T element;
        int i = 0;
        while (iterator.hasNext()) {
            element = iterator.next();
            iterator2 = coll.iterator();
            i = 0;
            while (iterator2.hasNext()) {
                if (element.equals(iterator2.next()) && i++ != 0) {
                    iterator2.remove();
                    iterator = coll.iterator();
                }
            }
        }
        return coll;
    }
}