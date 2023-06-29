package OOP.Principles.Polymorphism;

public class Shapes {
    void area() {
        System.out.println("I am in Shapes");
    }

    // this method can not be overriden in its child classes
    final void hello() {
        System.out.println("hello world");
    }
}
