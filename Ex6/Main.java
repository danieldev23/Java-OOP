package Ex6_NTU;

public class Main {
    Shape shape1 = new Circle(5.0, "Red", true);
    Shape shape2 = new Rectangle(4.0, 6.0, "Blue", false);
    Shape shape3 = new Square(3.0, "Green", true);

        System.out.println(shape1);
        System.out.println("Area: " + shape1.getArea());
        System.out.println("Perimeter: " + shape1.getPerimeter());

        System.out.println(shape2);
        System.out.println("Area: " + shape2.getArea());
        System.out.println("Perimeter: " + shape2.getPerimeter());

        System.out.println(shape3);
        System.out.println("Area: " + shape3.getArea());
        System.out.println("Perimeter: " + shape3.getPerimeter());
}
}
