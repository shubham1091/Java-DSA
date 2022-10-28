package Pattern;

public class Rhombus {
    public static void main(String[] args) {
        solid(5);
    }
    static void solid(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
}
