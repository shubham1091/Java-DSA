package Alpha.Bit;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println((char) (ch | ' '));
        sc.close();

    }

}
