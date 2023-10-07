class Person {
    private String name;
    private int age;
    private String address;

}

public class Teacher extends Person {

    private String institutionName;
    private String[] courses;

    public Teacher(String name, int age, String address, String institutionName, String[] courses) {
        this.institutionName = institutionName;
        this.courses = courses;
    }

}