package task3;

public class Student extends Person {
    private String university;
    private String major;

    public Student(String name, int age, String address, String university, String major) {
        super(name, age, address);
        this.university = university;
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
