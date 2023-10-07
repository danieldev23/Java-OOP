public class Student {
    String name;
    int age;
    String address;

    double mathScore, physicScore;

    public Student(String name, int age, String address, double mathScore, double physicScore) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mathScore = mathScore;
        this.physicScore = physicScore;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPhysicScore() {
        return physicScore;
    }

    public void setPhysicScore(double physicScore) {
        this.physicScore = physicScore;
    }

    public void avarageScore() {
        System.out.println("Average score is: " + (mathScore + physicScore)/2);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", mathScore=" + mathScore +
                ", physicScore=" + physicScore +
                '}';
    }
}
