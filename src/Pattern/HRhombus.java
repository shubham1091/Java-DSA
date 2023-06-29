package Pattern;
public class HRhombus{
    public static void main(String[] args) {
        Hollow(5);
    }
    static void Hollow(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                if(i==1|j==1||i==row||j==row){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}