package Methods;

public class OverLoading {
    public static void main(String[] args) {
        fun(3);
        fun("hi");
        // when two or more functions have same name but different arguments or return
        // type it is known as function overloading
    }

    // function overloading happens at compile time
    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static float fun(Float c) {
        System.out.println(c);
        float k = c;
        return k;
    }

}
