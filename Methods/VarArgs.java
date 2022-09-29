package Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // variable length arguments which means the length of the arguments can vari
        fun(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // we can pass any number of arguments here
        demo(1, 2, 3, 4, 5);
        demo("shubham", "verma", "Hello");
        // if we leave demo() empty it will give error it is known as ambiguity becous
        // varargs can not be empty in case of function overloading
        /*
         * demo();//ambigous
         */
    }

    // when you dont how many arguments you are going to get we use varargs
    static void fun(int... v) {
        // it takes all the arguments as an array
        System.out.println(Arrays.toString(v));
    }

    // variable length arguments must always come at the end
    static void multiple(int a, int b, String... v) {
        // we have to provide arguments in same order as parameters
        // orher wise it will give error
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }
}
