package Alpha.Greedy;

public class Large {
    /*
     * Kth largest odd number in given range
     * we have to variables L and R indicating a range of
     * integers from L to R inclusive and a number K the
     * task is to find Kth largest off number if K > number
     * of odd numbers in the range L to R then return 0
     * input L = -3 R =3 K =1
     * output = 3
     */
    public static void main(String[] args) {
        int[] p = { -3, 3 };
        int K = 1;
        System.out.println(KthOdd(p, K));
    }

    private static int KthOdd(int[] range, int k) {
        if (k <= 0) {
            return 0;
        }
        int L = range[0];
        int R = range[1];

        if ((R & 1) > 0) {
            int count = (int) Math.ceil((R - L + 1) / 2);
            if (k > count) {
                return 0;
            } else {
                return (R - 2 * k + 2);
            }
        } else {
            int count = (R - L + 1) / 2;
            if (k > count) {
                return 0;
            } else {
                return (R - 2 * k + 1);
            }
        }
    }

}
