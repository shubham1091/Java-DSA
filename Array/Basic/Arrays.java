package Array.Basic;

public class Arrays {
    public static void main(String[] args) {
        // arrays ate a collection of same data type
        /*
         * syntax
         * datatype[] variable_neme = new datatype [size];
         */
        // store 5 roll numbers
        String[] rnos = new String[5];
        // or directly
        int[] ron = { 1, 2, 3, 4, 5 };

        int[] ros;// declaration of array. ros is getting defined in stack
        ros = new int[5];
        /* initialisation: actually here object is being created in the menory (heap) */
        /*
         * c or c++ arrays are stored in continus memory location but in java there is
         * no consept of pointers it depends on jvm how the array is going to be stored
         * 
         * array objects are in heap
         * heap objects are not continus
         * Dynamic memory allocation
         * array objects are in java may not be continus --> depends on jvm
         */
        // new keyword => new is used to create an object in heap
        System.out.println(ron[3]);
        System.out.println(ros[1]);// all the int array by default all the elements are initialised with '0'
        System.out.println(rnos[2]);// all the string array are initialised with "null"
        /*
         * null is not a keyword it is a spatial literal we can not create null type
         * variables also can not use with primitives
         * String str = null;
         * int num = null;//error
         */
        
    }
}