package Pattern;

public class Floyd {
    public static void main(String[] args) {
        floyd(5);
    }
    static void floyd(int row){
        int n=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                ++n;
            }
            System.out.println();
        }
    }
    
}
