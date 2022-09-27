package ConditionLoop;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Q: find the largest of three number
        //simple way
        System.out.println(Math.max(a,Math.max(b,c)));

        //there are manys to solve this problem here is another way
        int max =a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);

        sc.close();

    }
    
}
