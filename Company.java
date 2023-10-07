public class Company {

    private String name;
    private String address;

    private double income;
    private double cost;

    public Company(String name, String address, double income, double cost) {
        this.name = name;
        this.address = address;
        this.income = income;
        this.cost = cost;
    }

    public double calculateBenefit() {
        return income - cost;
    }

    public void displayInfo() {
        System.out.println("Company name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Income: " + income);
        System.out.println("Cost: " + cost);
        System.out.println("Benefit: " + calculateBenefit());
    }
}