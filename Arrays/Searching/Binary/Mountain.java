package Arrays.Searching.Binary;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 3, 2, 0 };
        System.out.println(search(arr));

    }

    static int peak(int[] arr) {
        int st = 0;
        int en = arr.length - 1;
        while (st < en) {
            int mid = st + (en - st) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid + 1]) {
                en = mid;
            } else {
                st = mid;
            }
        }
        return -1;
    }
    
    //leet code 852 & 162

    static int search (int[]arr){
        int st=0;
        int en = arr.length - 1;
        while (st < en) {
            int mid = st + (en - st) / 2;
            if (arr[mid] > arr[mid + 1]) {
                en = mid;
            }else{
                st=mid+1;
            }
        }
        return st;
    }

}
