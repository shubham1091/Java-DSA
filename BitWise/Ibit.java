package BitWise;

public class Ibit {
    public static void main(String[] args) {
        // int n =7;
        System.out.println((~0));
    }

    static int check(int n) {
        return n & (1 << (n - 1));
    }

}
