package universitystudy.oopstudy1;

public class test {
    public static void main(String[] args) {
        Student c = new Student("hc");
        Student b = new Student("ts", 4, "NYU", new String[] { "ENG", "MUS", "CSC" });
        System.out.println(c.getName());
        System.out.println(b.getUniversity());
        c.greet();
        b.greet();
        System.out.println(Student.getNumStudents());
        System.out.println(Student.sameUniversity(c, b));
        System.out.println(c.sameUniversityAs(b));

    }
}
