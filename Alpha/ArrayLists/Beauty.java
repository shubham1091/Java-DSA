package Alpha.ArrayLists;

import java.util.ArrayList;

public class Beauty {
    /*
     * Beautiful ArrayList=>
     * An Arraylist nums of size n is beautiful if:nums is a permutation of the
     * integers in the range [1,n].For every 0<=i<j<n,there is no index k with i<k<j
     * where 2*nums.get(k)==nums.get(i)+nums.get(j).Given the integer n,return
     * any beautiful arraylist nums of size n.There will be atleast one valid answer
     * for the given n.
     * Sample Input 1: n = 4
     * Sample Output 1: [2,1,4,3]
     * Sample Input 2: n = 5
     * Sample Output 2:[3,1,2,5,4]
     * Constraints:
     * 1 <= n <= 1000
     */
    public static void main(String[] args) {
        System.out.println(arr(4));
    }

    static ArrayList<Integer> art(int n) {
        /*
         * Approach 1(Iterative)
         * We can see that if we separate odd and even numbers then there is no
         * possibility that even
         * numbers will violate the rule with odd numbers and vice versa.
         * Now we have to arrange even and odd numbers in such a way that they do not
         * violate rules with themselves.For doing so first let's say we have a
         * beautiful arraylist of size n and we want to make n+1 size of arraylist
         * so what we do is first put all odd numbers that lie with in 1 to n+1 and
         * then even(WE can do even the n odd also).
         * Beautiful arraylist has the property that if we multiply any number with
         * arraylist then it still remains beautiful or if we add or subtract any number
         * from arraylist then it still remains beautiful.For only obtaining even number
         * from n size arraylist we do 2*num and for obtaining odd size arraylist
         * we do 2 * n-1 .
         */
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Integer e : ans) {
                if (2 * e <= n) {
                    temp.add(e * 2);
                }
            }
            for (Integer e : ans) {
                if (2 * e - 1 <= n) {
                    temp.add(e * 2 - 1);
                }
            }
            ans = temp;
        }
        return ans;
    }

    static ArrayList<Integer> arr(int n) {
        /*
         * Approach 2(Divide & Conquer)
         * Let's start froma simple 3 numbers case:(1,2,3)-> the only thing we need to
         * do is move 2 out of 1 and 3 -> (1, 3, 2).Then what if the case is (1,5,9)
         * which has increment =4? It's the samething-> move 3out of 1 and 5 ->
         * (1,9,5). Now,what if the case is(1,3,5,7,9)? With the odd+even or
         * divide+conquer idea in mind,we can simply divide it to (1,5,9) and (3,7).
         * Since no change is needed for the 2 numbers case, after following the above
         * steps, we can conquer them to (1, 9, 5, 3,7).
         */
        ArrayList<Integer> res = new ArrayList<>();
        divide(1, 1, res, n);
        return res;
    }

    static void divide(int st, int en, ArrayList<Integer> res, int n) {
        if (st + en > n) {
            res.add(st);
            return;
        }
        divide(st, 2 * en, res, n);
        divide(st = en, en * 2, res, n);
    }

}
