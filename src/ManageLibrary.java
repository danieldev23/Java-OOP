import java.util.ArrayList;
import java.util.Arrays;

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

    public void addStudent(String id, String email, String lastName, String firstName, int age, ArrayList<String> borrowBookIds) {
        Student student = new Student(id, email, lastName, firstName, age);
        for (String bookId : borrowBookIds) {
            Book book = findBookById(bookId);
            if (book != null) {
                student.borrowBook(bookId);
            }
        }
        students.add(student);
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    private Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }
    public void showAllStudentsWithBorrowedBooks() {
        for (Student student : students) {
            student.display();
            System.out.println();
            System.out.print("Book name: ");
            System.out.println(getBookName());
        }
    }

    private String getBookName() {
        for (Book book : books) {
                return book.getName();

        }
        return "";
    }
    private String getBookById(String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return book.getName();
            }
        }
        return null;
    }
    public void showBorrowingBooksOfStudent(String studentId) {
        System.out.println(getBookById(studentId));

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

    public void showBorrowedBooks(String studentId) {

        for(Student s : students) {
            if(s.id.equals(studentId)) {

                System.out.println("Student: " + s.id + ", " + s.firstName + " " + s.lastName);
                System.out.println("Borrowed books:");

                Arrays.stream(s.borrowBook).forEach(bookId -> {
                    for (Book b : books) {
                        if (b.id.equals(bookId)) {
                            b.display(); //print book details
                        }
                    }
                });
            }
        }
    }
}
