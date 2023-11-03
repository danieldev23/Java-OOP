package Ex6_5NTU;

public class Student implements IStudent {

    public String Student;
    private String fullName;
    private int id;
    private String dateOfBirth;
    private String nativePlace;
    private String studentClass;
    private String phoneNo;
    private long mobile;

    public Student(String fullName, int id, String dateOfBirth, String nativePlace, String studentClass, long mobile) {
        this.fullName = fullName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.nativePlace = nativePlace;
        this.studentClass = studentClass;
        this.phoneNo = phoneNo;
        this.mobile = mobile;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public void Display() {
        System.out.println("Full Name: " + fullName);
        System.out.println("ID: " + id);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Native Place: " + nativePlace);
        System.out.println("Class: " + studentClass);
        System.out.println("Phone No: " + phoneNo);
        System.out.println("Mobile: " + mobile);
    }

}