package FirstJava;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pleae enter temp in C : ");
        float tempC = sc.nextFloat();
        float tempF = (tempC * 9 / 5) + 32;
        System.out.println("temp in F is "+tempF);
        sc.close();
    }
    
}
