package Methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // System.out.println(nums);
        // here we can see even though nums is a variable in random but it is not
        // showing in the main function
        // because it is out of scope
        {
            a = 89;
            // a is part of the biger block hanse we can use it in the smaller block
            int c = a+b;
            
        }
        // it is known as block scope c is inside the curly braces
        // in simple term value that are initialised in the block will remain in the
        // block
        // System.out.println(c);//can not use out side the block 

    }

    static void random(int marks) {
        int nums = 45;
        System.out.println(nums);
    }

}
