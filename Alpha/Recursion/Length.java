package Alpha.Recursion;

public class Length {
    public static void main(String[] args) {
        System.out.println(len("shubham"));
    }
    static int len(String str){
        if(str.length()==0){
            return 0;
        }
        return len(str.substring(1))+1;

    }
    
}
