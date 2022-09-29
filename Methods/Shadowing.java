package Methods;

public class Shadowing {
    static int a = 10;// this will be shadowed at line 11
    static int x = 33;

    /*
     * Shadowing in Java is the practice of using variables in overlapping scopes
     * with the same name where the variable in low-level scope overrides the
     * variable of high-level scope. Here the variable at high-level scope is
     * shadowed by the low-level scope variable.
     */
    // shadowing does not work in methods only for class variables
    public static void main(String[] args) {
        int x;
        // System.out.println(x);//scope will begin when value is initialised
        x = 90;
        System.out.println(x);
        System.out.println(a);
        int a = 39;// the class variable at line 4 is shadowed by this
        System.err.println(a);// a = 39
        fun();
    }

    static void fun() {
        System.out.println(a);
    }

}
