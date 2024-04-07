import geometry.Rectangle;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7.0, 2.0); 
        double area = rectangle.calculateArea();
        System.out.println("Pole prostokąta: " + area);
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Obwód prostokąta: " + perimeter);
    } 
}
