import java.util.ArrayList;
import java.util.Date;
import java.util.Comparator;
class Student implements IPrint {
    private String id;
    private String email;
    private String lastName;
    private String firstName;
    private int age;
    public ArrayList<String> borrowBooks;

    public Student(String id, String email, String lastName, String firstName, int age) {
        this.id = id;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.borrowBooks = new ArrayList<>();
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Age: " + age);
        System.out.println("Borrowed Books: " + borrowBooks.toString());
    }

    public String getId() {
        return id;
    }

    public void borrowBook(String bookId) {
        borrowBooks.add(bookId);
    }

    public void returnBook(String bookId) {
        borrowBooks.remove(bookId);
    }
}
