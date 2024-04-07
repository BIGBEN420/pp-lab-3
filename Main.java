import geometry.Point;
import geometry.Circle;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(8.0, 3.0);
        Circle circle = new Circle(center, 6.0);

        System.out.println("Wartości koła:");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole koła: " + circle.getArea());
    } 
}