package OOP.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student shubham = new Student(26, 87.58f);
        Student akash = new Student(1, 80.23f);
        Student anand = new Student(2, 86.43f);
        Student anjana = new Student(25, 89.0f);
        Student aayushi = new Student(27, 88.3f);

        Student[] list = { shubham, akash, anand, anjana, aayushi };
        System.out.println("Old array \n" + Arrays.toString(list));
        Arrays.sort(list);//
        System.out.println("New array sorted using marks \n" + Arrays.toString(list));

        /*
         * if (shubham.compareTo(akash) > 0) {
         * System.out.println("shubham");
         * System.out.println(shubham.compareTo(akash));
         * }
         */
    }

}
