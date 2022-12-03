package Array.Sorting;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int[]arr={1,4,1,3,2,4,3,7};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[]arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            mx=Math.max(mx,arr[i]);
        }
        int[]count = new int[mx+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j =0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    
}
