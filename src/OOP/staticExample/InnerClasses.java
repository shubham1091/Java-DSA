package OOP.staticExample;

//outside classes can not be static
public class InnerClasses {
    // only inner classes can be static
    class test {
        // when this is inside it depends on some other class
        String name;

        public test(String name) {
            this.name = name;

        }
    }

    static class fun {
        // this will work
        String name;

        public fun(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {
        // test a = new test("shubham"); gives error becouse test is not static
        // but we can do this
        Test a = new Test("shubham");
        fun b = new fun("shubham");
        fun c = new fun("aayushi");

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(c.name);

    }

}

class Test {
    // when outside it does not depends on any other class
    String name;

    public Test(String name) {
        this.name = name;
    }
}