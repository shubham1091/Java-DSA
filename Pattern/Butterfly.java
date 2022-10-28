package Pattern;

public class Butterfly {
    public static void main(String[] args) {
        butterfly(5);
    }
    static void butterfly(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(j<=i){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=row;j++){
                if(j>row-i){
                    System.out.print("#");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=row;i>=1;i--){
            for(int j=1;j<=row;j++){
                if(j<=i){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=row;j++){
                if(j>row-i){
                    System.out.print("#");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
