package Alpha.Operators;

public class Result {
    public static void main(String[] args) {
        // Q 1
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.println(exp1 + " , " + exp2);// exp1 =5 & exp2 = 4

        // Q2
        int a = 200, b = 50, c = 100;
        if (a > b && b > c) {// false
            System.out.println("Hello");
        }
        if (c > b && c < a) {// true
            System.out.println("Java");
        }
        if ((b + 200) < a && (b + 150) < c) {// false
            System.out.println("Hello Java");
        }
        // Q3
        int i, j, k;
        i = j = k = 2;
        i += j;//i=4
        j -= k;//j=0
        k /= (i + j);//k=0
        System.out.println(i + " " + j + " " + k);
        // Q4
        int l = 9, m = 12;
        int s = 2, t = 4, u = 6;
        int exp = 4 / 3 * (l + 34) + 9 * (s + t * u) + (3 + m * (2 + s)) / (s + t * m);
        System.out.println(exp);//278
        // Q5
        int g = 10, h = 5;
        int ep = (h * (g / h + g / h));
        int cp = (h * g / h + h * g / h);
        System.out.println(ep);//20
        System.out.println(cp);//20
    }

}
