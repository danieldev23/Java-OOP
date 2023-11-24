import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class ManageLibrary {
    private ArrayList<Book> books;
    private ArrayList<Student> students;

    public ManageLibrary() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addBook(String id, String name) {
        books.add(new Book(id, name));
    }

    public void addStudent(String id, String email, String lastName, String firstName, int age) {
        students.add(new Student(id, email, lastName, firstName, age));
    }

    public void showAllStudentsWithBorrowedBooks() {
        for (Student student : students) {
            student.display();
            System.out.println();
        }
    }

    public void showBorrowingBooksOfStudent(String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                student.display();
                break;
            }
        }
    }

    public void resetBookStatus(String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                book.returnBook();
                break;
            }
        }
    }

    public int calculateMoneyForLateReturn(String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                int totalFine = 0;
                for (String bookId : student.borrowBooks) {
                    for (Book book : books) {
                        if (book.getId().equals(bookId)) {
                            totalFine += book.calculateFine();
                        }
                    }
                }
                return totalFine;
            }
        }
        return 0;
    }

    public void sortBooksByEndDate() {
        books.sort((b1, b2) -> {
            if (b1.calculateFine() == b2.calculateFine()) {
                return 0;
            } else if (b1.calculateFine() < b2.calculateFine()) {
                return -1;
            } else {
                return 1;
            }
        });
    }

    public void sortBooksByNameAndEndDate() {
        books.sort((b1, b2) -> {
            if (b1.getName().equals(b2.getName())) {
                return b1.calculateFine() - b2.calculateFine();
            } else {
                return b1.getName().compareTo(b2.getName());
            }
        });
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
}
