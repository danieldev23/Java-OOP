package Chapter6_VKU;

class EquilateralTriangle extends Shape {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double perimeter() {
        return 3 * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing an equilateral triangle");
    }
}
