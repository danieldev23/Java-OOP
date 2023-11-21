import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StoreApp {

    List<Product> products = new ArrayList<>();
    List<ReceiptItem> receipts = new ArrayList<>();

    // Load data from files

    public static void main(String[] args) throws ParseException {
        StoreApp app = new StoreApp();
        app.showMenu();
    }

    public void showMenu() throws ParseException {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("1. Manage Products");
            System.out.println("2. Manage Warehouse");
            System.out.println("3. Generate Reports");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manageProductsMenu();
                    break;
                case 2:
                    manageWarehouseMenu();
                    break;
                case 3:
                    generateReportsMenu();
                    break;
            }
        }

        // Save data before exiting
        sc.close();
    }

    public void manageWarehouseMenu() {
        // Add logic for managing the warehouse here
        System.out.println("Managing Warehouse");
    }
    public void generateReportsMenu() {
        // Add logic for generating reports here
        System.out.println("Generating Reports");
    }
    public void manageProductsMenu() throws ParseException {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. List Products");
            System.out.println("0. Back");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    listProducts();
                    break;
            }
        }

        // Close scanner after use
        sc.close();
    }

    public void addProduct() throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter product quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter expiration date (dd/MM/yyyy): ");
        String dateInput = sc.next();
        Date expirationDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateInput);

        Product product = new Product(products.size() + 1, name, price, qty, expirationDate);

        products.add(product);

        System.out.println("Product added successfully!");

        // Close scanner after use
        sc.close();
    }

    public void updateProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product id: ");
        int id = sc.nextInt();

        Product product = null;
        for (Product p : products) {
            if (p.getId() == id) {
                product = p;
                break;
            }
        }

        if (product == null) {
            System.out.println("Invalid product id!");
            return;
        }

        // Consume the newline character
        sc.nextLine();

        System.out.print("Enter new name: ");
        String name = sc.nextLine();

        System.out.print("Enter new price: ");
        double price = sc.nextDouble();

        product.setName(name);
        product.setPrice(price);

        System.out.println("Product updated successfully!");

        // Close scanner after use
        sc.close();
    }

    public void deleteProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product id to delete: ");
        int id = sc.nextInt();

        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                System.out.println("Product deleted successfully!");
                return;
            }
        }

        System.out.println("Invalid product id!");

        // Close scanner after use
        sc.close();
    }

    public void listProducts() {
        System.out.println("Listing all products:");

        for (Product product : products) {
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Expiration: " + product.getExpirationDate());
            System.out.println();
        }
    }
}
