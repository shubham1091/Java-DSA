package OOP.Abstract;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);

    }

    @Override
    void partner(String name) {
        System.out.println("I love " + name + " she is " + this.age);

    }

}
