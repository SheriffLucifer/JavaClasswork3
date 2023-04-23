import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        List<Integer> list = createList(10, 4, 10);
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    static List<Integer> createList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    static void sort(List<Integer> list) {
        Collections.sort(list, Comparator.reverseOrder());
    }
}