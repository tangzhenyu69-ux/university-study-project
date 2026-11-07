package universitystudy.oopstudy4;

public class Shape {
    private String color;

    public Shape() {
        this("red");
    }

    public Shape(String color) {
        System.out.println("shape");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void describe() {
        System.out.println("This is a " + color + " shape.");
    }
}
