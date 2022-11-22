package OOP.generics;

import java.util.ArrayList;

public class Lamda {
    // lamda expressions
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
        list.forEach((item) -> System.out.print(item * 2 + "  "));

        System.out.println();

        Operation sum = (a, b) -> a + b;// Now the sum variable become a function
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        Lamda fun = new Lamda();
        System.out.println(fun.operate(5, 3, sum));
        System.out.println(fun.operate(5, 3, prod));
        System.out.println(fun.operate(5, 3, sub));

    }

    private int operate(int a, int b, Operation op) {
        return op.ofc(a, b);
    }

}

interface Operation {
    int ofc(int a, int b);
    // can not create more then one function
}