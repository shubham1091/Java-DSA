package OOP.Principles.Polymorphism;

public class Main {
    // polymorphism is act of representing something in multiple ways
    public static void main(String[] args) {

        Shapes shape = new Shapes();
        /*
         * here which method will be called depends on
         * the child class methods
         * parent class methods will be overriden by
         * the child class methods
         */
        Shapes circle = new Circle();// upcasting
        Square square = new Square();
        Shapes triangle = new Triangle();

        shape.area();
        circle.area();// upcasting
        square.area();
        triangle.area();
    }

}
