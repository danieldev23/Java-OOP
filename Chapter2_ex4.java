import java.util.ArrayList;

public class Chapter2_ex4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");

        System.out.println(list.get(0));

        list.remove(1);

        System.out.println(list.size());
    }
}
