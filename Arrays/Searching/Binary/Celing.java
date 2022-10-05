package Arrays.Searching.Binary;

public class Celing {
    public static void main(String[] args) {
        // int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        // System.out.println(celing(arr, 19));
        char[] ch = { 'a', 'd', 'k' };
        System.out.println(search(ch, 'k'));
    }

    static int celing(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int st = 0;
        int en = arr.length - 1;

        while (st <= en) {
            int mid = st + (en - st) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                en = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return st;

    }

    static int flor(int[] arr, int target) {
        int st = 0;
        int en = arr.length - 1;
        while (st <= en) {
            int mid = st + (en - st) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                en = mid - 1;
            }
        }
        return en;
    }

    // leet code
    static char search(char[] arr, char target) {
        int st = 0;
        int en = arr.length - 1;
        while (st <= en) {
            int mid = st + (en - st) / 2;
            if (arr[mid] > target) {
                en=mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return arr[st % arr.length];
    }
    

}
