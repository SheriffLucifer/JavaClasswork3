import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(4);
        list.add("154");
        list.add("Hello");
        list.add("Hello");
        list.add(77);
        list.add(5);
        list.add(4.5);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof String) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
