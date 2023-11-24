import java.util.ArrayList;
import java.util.Date;
import java.util.Comparator;
class Book implements IPrint {
    private String id;
    private String name;
    private boolean status;
    private Date startTime;
    private Date endTime;

    public Book(String id, String name) {
        this.id = id;
        this.name = name;
        this.status = false;
        this.startTime = null;
        this.endTime = null;
    }

    public void display() {
        System.out.println("Book ID: " + id);
        System.out.println("Book Name: " + name);
        System.out.println("Status: " + (status ? "Borrowed" : "Available"));
        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void borrowBook() {
        status = true;
        startTime = new Date();
        endTime = null;
    }

    public void returnBook() {
        status = false;
        endTime = new Date();
    }

    public int calculateFine() {
        if (endTime != null) {
            long diff = new Date().getTime() - endTime.getTime();
            long days = diff / (24 * 60 * 60 * 1000);

            if (days < 5) {
                return (int) days * 5000;
            } else if (days < 10) {
                return (int) days * 8000;
            } else {
                return (int) days * 10000;
            }
        }

        return 0;
    }
}