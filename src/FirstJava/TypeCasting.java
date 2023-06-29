package FirstJava;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // when one type of data is assigned to another type of variable an automatic
        // type conversion take place if the following condition is true
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat(); // if you enter an integer it will not give an error message
        System.out.println(num);
        int cast = sc.nextInt();// if you enter a float it will not give an error message
        // because in java nerowing type conversion takes place
        System.out.println(cast);

        int result = (int) (67.54f);// this is known as explicit conversion or type casting
        System.out.println(result);

        // automatic type promotion in expressions

        int a = 257;
        byte b = (byte) a; // 257%256 = 1
        System.out.println(b);
        // if we do [b = b * 2;] then it will give error because when evaluating
        // expressions byte will cast into int and range of int is larger then bype hans
        // the error

        int number = 'A';
        System.out.println(number);
        // java follows unicode
        System.out.println("こんにちは");// hello in japanese konnichiwa

        // all byte , short , char are promoted into int
        // and after that the whole expression will be promoted into the larger datatype
        // in the expression

        b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.123456;
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        double res = (f * b) + (i / c) - (d - s);
        System.out.println(res);

        sc.close();
    }

}
