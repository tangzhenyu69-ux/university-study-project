package universitystudy.oopstudy1;

public class Student {
    private String name;
    private int year;
    private String university;
    private String[] majors;
    private static int numStudents;

    public Student(String name) {
        this(name, 1, "CUHKSZ", new String[] { "undeclared" });
    }

    public Student(String name, int year, String university, String[] majors) {
        this.name = name;
        this.year = year;
        this.university = university;
        this.majors = majors;
        setNumStudents();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getUniversity() {
        return university;
    }

    public String[] getMajors() {
        return majors;
    }

    public void greet() {
        if (majors.length == 1) {
            System.out.println("1 major");
        } else {
            System.out.print("Hi, my name is " + name + ". I'm a year " + year + "  student at " + university
                    + ". My majors are ");
            for (int i = 0; i < majors.length; i++) {
                if (i != majors.length - 1) {
                    System.out.print(majors[i] + " and ");
                } else
                    System.out.print(majors[i] + ".");
            }
        }
        System.out.println();
    }

    public static void setNumStudents() {
        numStudents++;
    }

    public static int getNumStudents() {
        return numStudents;
    }

    public static boolean sameUniversity(Student a, Student b) {
        // if (a.getUniversity().equals(b.getUniversity()))
        // return true;
        // else
        // return false;
        return a.sameUniversityAs(b);
    }

    public boolean sameUniversityAs(Student b) {
        if (this.university.equals(b.getUniversity()))
            return true;
        else
            return false;
    }
}
