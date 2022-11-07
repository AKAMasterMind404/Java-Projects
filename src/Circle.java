public class Circle {
    private double radius;

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }
}
