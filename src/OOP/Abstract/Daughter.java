package OOP.Abstract;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);

    }

    @Override
    void partner(String name) {
        System.out.println("I love " + name + " he is " + this.age);

    }

}
