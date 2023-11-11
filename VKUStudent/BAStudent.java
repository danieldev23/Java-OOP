package VKUStudent;

public class BAStudent implements IVKUStudent{

    private String name;
    private double gpa;

    public BAStudent(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getGpa() {
        return gpa;
    }

    @Override
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void print() {
        System.out.println("BA Student: ");
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }

}