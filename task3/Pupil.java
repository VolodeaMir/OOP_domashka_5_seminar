package task3;

public class Pupil extends Person {
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    private String school;
    private String grade;

    public Pupil(String name, int age, String address, String school, String grade) {
        super(name, age, address);
        this.school = school;
        this.grade = grade;
    }
}
