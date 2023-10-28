
public class Main {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(3, 6);
        Point p2 = new Point(6, 9);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
    }
}