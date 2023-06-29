package Pattern;

public class Triangle {
    public static void main(String[] args) {
        on(5);
    }

    static void on(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }

            }
            System.out.println();
        }
    }

}
