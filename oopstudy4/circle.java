package universitystudy.oopstudy4;

public class circle extends Shape {
    private int radius;
    public static final double PI = 3.14;

    public circle() {
        this("red", 1);
    }

    public circle(String color, int radius) {
        super(color);
        this.radius = radius;
        System.out.println("circle");
    }

    public double getarea() {
        return PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void describe() {
        // TODO Auto-generated method stub
        System.out.println("This is a " + getColor() + " circle with radius " + radius);
    }

    public void describe(String owner) {
        System.out.println("This is a " + getColor() + " circle with radius " + radius + " owned by " + owner);
    }

}
