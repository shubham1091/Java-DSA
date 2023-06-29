package OOP.staticExample;

public class Main {
    /*
     * main is declared static so we can use main method without
     * creating a object of that class directly
     */
    public static void main(String[] args) {
        Human shubam = new Human(20, "shubham verma", 100000, false);
        Human aayushi = new Human(20, "aayushi verma", 100000, false);

        // System.out.println(aayushi.population);
        System.out.println(Human.population);

        /*
         * we can not do this
         * greeting();
         * becouse inside a static method we cannot use anything that
         * is not static
         * a non static data belongs to an object
         * we cannot use this becouse it requires an instance but the function
         * that you are using in does not depends on object
         */
        // so how to use a non static data inside static
        System.out.println(shubam.name + " " + aayushi.name);

    }

    void greeting() {
        System.out.println("Hello World");
        // we can use static inside non static
        fun();
    }

    static void fun() {
        System.out.println("fun");
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

}
