package OOP.Abstract;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    abstract void career(String name);

    abstract void partner(String name);

    static void hello(){
        System.out.println("Hey!");
    }

}
