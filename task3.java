import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        ex3();
    }

    static void ex3() {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "Фэнтези", "Гарри Поттер");
        addBook(shopBook, "Сказки", "Колобок");
        addBook(shopBook, "Фэнтези", "Властелин колец");
        addBook(shopBook, "Роман", "Война и мир");
        addBook(shopBook, "Сказки", "Красная шапочка");
        System.out.println(shopBook);
    }

    static void addBook(List<List<String>> shopBook, String genre, String name) {
        for (int i = 0; i < shopBook.size(); i++) {
            if (shopBook.get(i).get(0).equalsIgnoreCase(genre)) {
                shopBook.get(i).add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(name);
        shopBook.add(list);
    }
}