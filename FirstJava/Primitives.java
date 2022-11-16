package FirstJava;

public class Primitives {
    public static void main(String[] args) {
        // Here we are going to discuss Data Types in java
        // 8 bit = 1 byte
        byte b = 4; // 1 byte range [-128 to 127]
        short s = 245;// 2 byte range [-32768 to 32767]
        int roll = 64;// 4 byte range [-2,147,483,648 to 2,147,483,647]
        char latter = 's';// 2 byte range [ASCII values ]
        float marks = 98.76F;// 4 byte range [6 to 7 decimal digits]
        double largeDecimalNumbers = 4_567_654.4567;// 8 byte range [15 dicimal digits]
        long largeInteger = 34_567_898_765_432L;
        // 8 byte range [-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807]
        boolean check = false;// 1 byte [true or false]

        System.out.println("byte b is " + b);
        System.out.println("short s is " + s);
        System.out.println("int roll is " + roll);
        System.out.println("char latter is " + latter);
        System.err.println("float marks is " + marks);
        System.out.println("double largeDecimalNumbers is " + largeDecimalNumbers);
        System.out.println("long largeInteger is " + largeInteger);
        System.out.println("boolean check is " + check);
    }

}
