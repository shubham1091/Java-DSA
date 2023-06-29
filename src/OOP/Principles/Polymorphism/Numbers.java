package OOP.Principles.Polymorphism;

public class Numbers {
    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2, 5));
        System.out.println(obj.sum(3, 3.14f));

    }

    //compile time polymorphism or static polymorphism
    //achieve by method overloading
    
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(int a, float b) {
        return a + b;
    }


}
