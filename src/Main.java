public class Main {

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape quad = new Quad();
        Shape circle = new Circle();
        Shape trapezoid = new Trapezoid();
        Shape rhombus = new Rhombus();
        Shape quadrilateral = new Quadrilateral();

        ShapeNamePrinter printer = new ShapeNamePrinter();

        printer.printName(triangle);
        printer.printName(quad);
        printer.printName(circle);
        printer.printName(trapezoid);
        printer.printName(rhombus);
        printer.printName(quadrilateral);
    }
}
