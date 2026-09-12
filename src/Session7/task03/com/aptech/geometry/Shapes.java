package Session7.task03.com.aptech.geometry;

public class Shapes {

    private Shapes() {
    }

    public static double circleArea(double r) {
        return Math.PI * r * r;
    }

    public static double rectangleArea(double w, double h) {
        return w * h;
    }

    public static double triangleArea(double base, double h) {
        return 0.5 * base * h;
    }
}
