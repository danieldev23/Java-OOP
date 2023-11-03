package Ex6_5NTU;

import java.util.ArrayList;
import java.util.Scanner;

class StudentManager {
    static int nextId = 1;
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert new Student");
            System.out.println("2. View list of Students");
            System.out.println("3. Search Students");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // insert student logic
                System.out.print("Enter student name: ");
                String name = scanner.next();
                System.out.println("Enter student ID: ");
                int id = scanner.nextInt();
                System.out.println("Enter student date of birth: ");
                String db = scanner.next();
                System.out.println("Enter student class: ");
                String cl = scanner.next();
                System.out.println("Enter student phoneNo: ");
                String phoneNo = scanner.next();
                System.out.println("Enter student mobile: ");
                long mobile = scanner.nextLong();
                Student s = new Student(name, id, db, cl, phoneNo, mobile);
                students.add(s);

            } else if (choice == 2) {
                // view students logic
                for (Student s : students) {
                    s.Display();
                }

            } else if (choice == 3) {
                // search students logic
                System.out.print("Enter class to search: ");
                String classs = scanner.next();

                for (Student s : students) {
                    if (s.Student.equals(classs)) {
                        s.Display();
                    }
                }

            } else if (choice == 4) {
                break;
            }
        }

        scanner.close();
    }
}