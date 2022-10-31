package Recursion;

public class Pairing {
    /*
     * Friends Pairing Problem
     * Given n friends, each one can remain single or can be paired up with some
     * other friend. Each friend can be paired only once. Find out the total number
     * ofways in which friends can remain single or can be paired up.
     */
    public static void main(String[] args) {
        System.out.println(friends(3));
    }

    static int friends(int n){
        if(n==1||n==2){
            return n;
        }
        //choice
        //single
        int fnm1 = friends(n-1);
        //pair
        int fnm2= friends(n-2);
        int way = (n-1)*fnm2;
        //total number of ways
        return fnm1+way;
    }

}
