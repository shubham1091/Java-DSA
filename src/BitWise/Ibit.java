package BitWise;

public class Ibit {
    public static void main(String[] args) {
        System.out.println(check(6, 100));
        System.out.println(set(3, 10));
        System.out.println(reset(2, 10));

    }

    static int check(int n, int x) {
        return (x & (1 << (n - 1))) == 0 ? 0 : 1;
    }

    static int set(int n, int x) {
        int temp = 1 << (n - 1);
        return x | temp;
    }

    static int reset(int n, int x) {
        int temp = 1 << (n - 1);
        temp = ~temp;
        return x & temp;
    }

}
