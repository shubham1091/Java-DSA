package Alpha.Variable_data_types;

public class Conversion {

    // What will be the type of result in the following java code?
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        // result = (f*b)+(i%c)-(d*s);
        System.out.println((f * b) + (i % c) - (d * s));// double
    }

}
