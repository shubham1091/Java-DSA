package OOP.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    /*
     * when a member is declared static it can be accessed before
     * any of the objects class been created and without referenceing
     * to the variables
     */
    // we can declare both method and variables static
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
        /*
         * when using static variables use classNmae.variable insted of
         * using this.variable static variable is not part of instance variables
         * so it does not make sance to use this.variable
         */

    }

    static void massage() {
        System.out.println("Hello, world!");
        /*
         * we can not use this keyword inside a static method because
         * this represent an object and static dosent need any object
         * System.out.println(this.name");
         * can not use this
         */
    }

}