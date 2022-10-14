package String;

public class Spalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("moom"));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0)
            return true;
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
