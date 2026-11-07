package universitystudy.oopstudy4;

public class test {
    public static void main(String[] args) {
        circle c1 = new circle();
        circle c2 = new circle("yellow", 4);
        System.out.println(c1.getarea());
        System.out.println(c2.getarea());
        System.out.println(c2.getColor());
        c2.setColor("green");
        System.out.println(c2.getColor());
        c1.describe();
        Shape s1 = new Shape("blue");
        s1.describe();
        c1.describe("Aveiro");
    }
}
