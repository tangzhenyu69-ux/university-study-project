package universitystudy.oopstudy2;

public class Student {
    private int year;
    private String name;
    private String university;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setYear(int year) {
        if (year >= 1 && year <= 10) {
            this.year = year;
            return true;
        } else
            return false;
    }

    public int getYear() {
        return year;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

}
