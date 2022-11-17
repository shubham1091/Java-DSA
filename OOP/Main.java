package OOP;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
         * int[] ron = new int[5];
         * String[] name = new String[5];
         * float[] marks = new float[5];
         * 
         * instede of makeing this we can create a class that contains this
         */
        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));
        // when we did't initialised student java will store null inside
        Student shubham = new Student(26, "shubham", 88.5f);
        shubham.greeting();

    }
}

// create a class
class Student {
    int rno;
    String name;
    float marks;

    /*
     * constructor is a spacial function that runs when you
     * create an object and it allocates some variables
     */

    // constructor
    Student() {
        this(0, null, 0.0f);
        // this is how you call a constructor from another constructor
    }

    // constructor overloading
    Student(int rno, String name, float marks) {
        /*
         * we need a way to add the values of the above properties
         * object by object we need one word to access every objaect
         */
        this.rno = rno;
        this.name = name;
        this.marks = marks;

    }

    Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    void greeting() {
        System.out.println("Hello my name is " + this.name);
    }
}