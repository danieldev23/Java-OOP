import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Comparator;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws ParseException {
        ManageLibrary library = new ManageLibrary();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("Library Management System Menu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Add a Student");
            System.out.println("3. Show all Students with Borrowed Books");
            System.out.println("4. Show Borrowing Books of a Student");
            System.out.println("5. Reset Book Status");
            System.out.println("6. Calculate Money for Late Return");
            System.out.println("7. Sort Books by End Date");
            System.out.println("8. Sort Books by Name and End Date");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.next();
                    System.out.print("Enter Book Name: ");
                    String bookName = scanner.next();
                    library.addBook(bookId, bookName);
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    String studentId = scanner.next();
                    System.out.print("Enter Student Email: ");
                    String studentEmail = scanner.next();
                    System.out.print("Enter Student Last Name: ");
                    String studentLastName = scanner.next();
                    System.out.print("Enter Student First Name: ");
                    String studentFirstName = scanner.next();
                    System.out.print("Enter Student Age: ");
                    String tuoi = scanner.next();
                    int studentAge = Integer.parseInt(tuoi);
                    System.out.print("Enter the Id of books you want to borrow: ");
                    ArrayList<String> borrowBookIds = new ArrayList<>();
                    String bookIdBorrowed = scanner.next();
                    String sDate = scanner.next();
                    Date startDate = df.parse(sDate);
                    String eDate = scanner.next();
                    Date endDate = df.parse(eDate);
                    borrowBookIds.add(bookIdBorrowed);

                    library.addStudent(studentId, studentEmail, studentLastName, studentFirstName, studentAge, borrowBookIds);
                    break;
                case 3:
                    library.showAllStudentsWithBorrowedBooks();
                    break;
                case 4:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.next();
                    library.showBorrowingBooksOfStudent(id);
                    break;
                case 5:
                    System.out.print("Enter Book ID to reset status: ");
                    String resetBookId = scanner.next();
                    library.resetBookStatus(resetBookId);
                    break;
                case 6:
                    System.out.print("Enter Student ID to calculate money for late return: ");
                    String lateReturnStudentId = scanner.next();
                    int lateReturnMoney = library.calculateMoneyForLateReturn(lateReturnStudentId);
                    System.out.println("Money for late return: " + lateReturnMoney);
                    break;
                case 7:
                    library.sortBooksByEndDate();
                    System.out.println("Books sorted by End Date:");
                    for (Book book : library.getBooks()) {
                        book.display();
                        System.out.println();
                    }
                    break;
                case 8:
                    library.sortBooksByNameAndEndDate();
                    System.out.println("Books sorted by Name and End Date:");
                    for (Book book : library.getBooks()) {
                        book.display();
                        System.out.println();
                    }
                    break;
                case 9:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
