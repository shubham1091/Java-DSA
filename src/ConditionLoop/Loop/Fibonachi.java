package ConditionLoop.Loop;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = sc.nextInt();
        int pre = 0;
        int curr = 1;
        int count = 2;
        while (count <= n) {
            int temp = curr;
            curr += pre;
            pre = temp;
            count++;
        }
        System.out.println(curr);
        sc.close();
    }

}
