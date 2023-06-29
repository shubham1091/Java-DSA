package Pattern;

public class NumberPyramid {
    public static void main(String[] args) {
        Pattern(5);
        
    }
    static void Pattern(int row){
        for(int i=1;i<=row;i++){
            int n = 1;
            for(int j=1;j<=row-i+1;j++){
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
    
}
