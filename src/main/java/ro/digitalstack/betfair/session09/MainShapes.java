package ro.digitalstack.betfair.session09;

public class MainShapes {

    public static double getPerimeter(Shape shape){
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * 2 * circle.radius();
        } else if (shape instanceof Square) {
            Square square = (Square) shape;
            return 4 * square.edge();
        }

        return -1;
    }

    public static double getPerimeterEnchanted(Shape shape){
        return switch (shape) {
            case Circle circle -> 2 * Math.PI * circle.radius();
            case Square square -> 4 * square.edge();
            //case String aaa -> 200;
            //default -> -1;
            case Rectangle rectangle -> 2 * (rectangle.width() + rectangle.length());
        };

    }


    public static void main(String[] args) {
        var circle = new Circle(2);
        System.out.println(circle.radius());

        System.out.println(getPerimeter(circle));

        System.out.println(getPerimeterEnchanted(circle));
    }


}
