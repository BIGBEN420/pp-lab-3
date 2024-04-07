import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;
public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(new Point(5.0, 2.5), 6.0);
        circles[1] = new ColoredCircle(new Point(4.0, 5.5), 8.0, "blue");

        for (Circle circle : circles) {
            double area = circle.calculateArea();
            System.out.println("Pole koła: " + area);
            if (circle instanceof ColoredCircle) {
                String color = ((ColoredCircle) circle).getColor();
                System.out.println("Kolor koła: " + color);
            }
        }
    } 
}
