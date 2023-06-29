package Alpha.Variable_data_types;

import java.util.Scanner;

public class Area {
    /* 
     * In a program input the side of a square. You have to output the area of the square.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter side of square:");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println(area);
        sc.close();
    }

}
