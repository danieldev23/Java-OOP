package VKUStudent;

public class ITStudent implements IVKUStudent{

    private String name;
    private double gpa;

    public ITStudent(String name, double gpa) {
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
        System.out.println("IT Student: ");
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }

}