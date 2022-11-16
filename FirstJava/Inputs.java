package FirstJava;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Plese enter some input: ");
        int rollno = sc.nextInt();// taking input
        System.out.println("your roll number is " + rollno);// output

        int a = 234_000_000;
        /*
         * Underscore is ignored and we can use this insted of comma to represent a
         * number
         */
        System.out.println(a);
        System.out.print("Enter you marks: ");
        float marks = sc.nextFloat();
        System.out.println(marks);

        sc.close();
    }

}
