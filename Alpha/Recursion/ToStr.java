package Alpha.Recursion;

import java.util.Scanner;

public class ToStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        str(num);
        sc.close();
    }

    static void str(int num) {
        if (num == 0) {
            return;
        }
        str(num / 10);
        switch (num % 10) {
            case 0 -> System.out.print("zero ");
            case 1 -> System.out.print("one ");
            case 2 -> System.out.print("two ");
            case 3 -> System.out.print("three ");
            case 4 -> System.out.print("four ");
            case 5 -> System.out.print("five ");
            case 6 -> System.out.print("six ");
            case 7 -> System.out.print("seven ");
            case 8 -> System.out.print("eight ");
            case 9 -> System.out.print("nine ");
        }
    }

}
