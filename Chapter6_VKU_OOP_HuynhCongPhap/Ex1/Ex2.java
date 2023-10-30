package Chapter6_VKU;

public class Ex2 {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        Circle circle = new Circle(3.0);
        EquilateralTriangle triangle = new EquilateralTriangle(4.0);

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
        square.draw();

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        circle.draw();

        System.out.println("Equilateral Triangle Area: " + triangle.area());
        System.out.println("Equilateral Triangle Perimeter: " + triangle.perimeter());
        triangle.draw();
    }
}
