package OOP;

public class Wrapper {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        // a and b are primetive
        Integer num1 = 45;
        Integer num2 = 43;
        // num1 and num2 are object
        swap(a, b);
        swap(num1, num2);
        // swap will not affect anything becouse Integer is a object of final
        // in final we can not change anything
        System.out.println(a + " " + b);
        System.out.println(num1 + " " + num2);
        final int BONUS = 33;
        // now we can not change BONUS if we want to change
        System.out.println("final variable " + BONUS);
        /*
         * final garenties the immutablity only when data type is of primitive
         * when final is used with objects the address of the refrence variable
         * pointing to the object will not change but the value of the object
         * can change
         */
        final A shubham = new A("shubham verma");
        // we can do this
        shubham.name = "verma shubham";
        /*
         * we can not do this
         * shubham = new A("vema shubham");
         */
        // finalize method
        A obj = new A("hello");
        for (int i = 0; i < 110000; i++) {
            obj = new A("name");
        }
        System.out.println(obj);

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    A(String name) {
        this.name = name;
    }

    // we will learn about Oberride and portected etc latter
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}