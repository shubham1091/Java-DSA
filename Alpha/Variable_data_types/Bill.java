package Alpha.Variable_data_types;

import java.util.Scanner;

public class Bill {
    /*
     * Enter cost of 3 items from the user (using float data type )- apencil, a pen
     * and an eraser. You have to output the cost of the items back to the user se
     * their bill
     * (Add on : you can also try adding 18% gst tax to the items in the bill as an
     * advanced problem)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the cost of items:");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cost = pen + pencil + eraser;
        float gst = cost * 0.18f;
        float total = cost + gst;
        System.out.println(" total cost is " + cost + " \n including gst " + total);
        sc.close();
    }

}
