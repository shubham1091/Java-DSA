package Pattern;

public class InvertedRHP {
    public static void main(String[] args) {
        pyramid(4);
    }
    static void pyramid(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(j<=row-i){
                    System.out.print(" ");

                }
                else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
    
}
