package Alpha.Method;

import java.util.Scanner;

public class Digsum {
    //Write a java method to compute the sum of the digits in an integer
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(" sum of digits inside " + number + " is " + digit(number));
        sc.close();
        
    }
    static int digit(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    
}
