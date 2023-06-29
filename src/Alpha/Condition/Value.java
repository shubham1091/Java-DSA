package Alpha.Condition;

public class Value {
    // What will be the value of x & y in the following program
    public static void main(String[] args) {
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false;// x=false
        int y = (a > b) ? a : b;// y=a
        System.out.println(x + "  " + y);
    }

}
