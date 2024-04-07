
import geometry.Point;
import geometry.ColoredCircle;
public class Main {
    public static void main(String[] args) {
        Point center = new Point(4.1, 8.3);
        ColoredCircle coloredCircle = new ColoredCircle(center, 6.2, "red");
        System.out.println("Właściwości kolorowego koła: ");
        System.out.println("Kolor koła: " + coloredCircle.getColor());
    } 
}
