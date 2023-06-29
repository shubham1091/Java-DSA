package OOP.Interface.Demo;

public class Hello implements B, A {
    @Override
    public void greet() {
        System.out.println("greet");

    }

    public static void main(String[] args) {
        Hello obj = new Hello();
        A.greeting();
        obj.greet();
    }

}
