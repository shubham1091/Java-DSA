package OOP.access;

public class SubClass extends A {
    public SubClass(int num, String name, float data) {
        super(num, name, data);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(32, "shubham Verma", 3.14f);
        int n = obj.n;
        System.out.println(n);
    }

}