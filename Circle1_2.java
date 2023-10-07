public class Circle1_2 {
    private double radius;

    public Circle1_2() {
        this.radius = 1.0;
    }
    public Circle1_2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius*radius*3.14;
    }
    public double getCircumference() {
        return radius*radius*Math.PI;
    }

    public String toString() {
        return "Circle1_2{" +
                "radius=" + radius +
                '}';
    }
}
