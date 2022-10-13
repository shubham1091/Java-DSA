package Alpha.Condition;

public class Fever {
    /*
     * Finish the following code so that it prints you have a fever if your
     * temperature is above 100 and otherwise prints you dont't have a fever
     * [
     * public static void main(String[] args) {
     * double temp = 103.5;
     * }
     * ]
     */
    public static void main(String[] args) {
        double temp = 103.5;
        if (temp > 100) {
            System.out.println("You have a fever!");
        } else {
            System.out.println("You dont have a fever!");
        }
    }

}
