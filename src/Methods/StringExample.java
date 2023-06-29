package Methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String massage =greet();
        System.out.println(massage);

        System.out.print("what is your name?");
        String nam = sc.next();
        String personalised = myGreet(nam);
        System.out.println(personalised);
        sc.close();
        
    }

    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }
    //Method with parameters
    static String myGreet(String name) {
        String massage = "Hello " + name;
        return massage;
    }

}
