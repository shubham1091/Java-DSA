package BitWise;

public class OddEven {
    public static void main(String[] args) {
        int n = 41;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

}
