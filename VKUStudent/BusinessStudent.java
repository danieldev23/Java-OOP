package VKUStudent;

import java.util.ArrayList;

public class BusinessStudent {
    public static void main(String[] args) {

        String itname = "Minh";
        double gpa = 10.0;
        double java = 9;
        double c = 8;

        IVKUStudent it = new ITStudent(itname, gpa);

        System.out.println();

        String baname = "Nguyet";
        double gpa_2 = 9.0;

        IVKUStudent ba = new BAStudent(baname, gpa);
        ba.print();

        ArrayList<IVKUStudent> list = new ArrayList<>();
        list.add(it);
        list.add(ba);

        for (IVKUStudent student : list) {
            student.print();
            System.out.println();
        }
    }
}