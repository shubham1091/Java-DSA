package ConditionLoop.Switch;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        // we can nest switch statements
        switch (empID) {
            case 1:
                System.out.println("shubham");
                break;
            case 2:
                System.out.println("Aayushi");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println(" IT Department");
                        break;
                    case "Management":
                        System.out.println(" Management Department");
                        break;
                    default:
                        System.out.println("No Department");
                        break;
                }
            default:
                System.out.println("invalid id");
        }

        // better way to write the same thing as above
        switch (empID) {
            case 1 -> System.out.println("shubham");
            case 2 -> System.out.println("Aayushi");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("It department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println(" invalid id");
        }
        in.close();
    }

}
