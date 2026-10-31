package universitystudy.oopstudy3;

public class Study {
    private String name;
    private int grade;
    private double gpa;
    private String major;

    public Study() {
    }

    public Study(String name, int grade, double gpa, String major) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void promote() {
        this.grade++;
    }

    public String check() {
        return this.major + ": " + this.gpa;
    }
}
