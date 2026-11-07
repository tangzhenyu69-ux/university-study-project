package universitystudy.quiz7;

public class Exercise {
    public static double totalArea(Shape[] shapes) {
        double sum = 0.0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                sum += shapes[i].getArea();
            }
        }
        return sum;
    }
}
