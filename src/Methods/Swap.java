package Methods;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //swap number code
        /* int temp = a;
        a=b;
        b=temp; */
        swap(a, b);
        System.out.println(a+ " "+b);
    }
    //this is not going to work because in java the parameters are getting passed by value 
    static void swap(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
        //this change will only be valid in this function scope only.
    }

    //primitives int, short, char,byte etc. passed by value
    //objects & stuf : passing value of the reference variable
    
    
}
