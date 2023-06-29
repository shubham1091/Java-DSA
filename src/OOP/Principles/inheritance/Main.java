package OOP.Principles.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("Box class "+box.l + " " + box.w + " " + box.h);

        BoxWeight box2 = new BoxWeight();
        System.out.println("BoxWeight class "+box2.h + " " + box2.weight);
        // box2 can access the h becouse BoxWeight inherite the properties of Box

        BoxWeight box3 = new BoxWeight(2, 5, 9, 9);
        Box box4 = new BoxWeight(1, 2, 3, 4);
        System.out.println("some randome values "+box3 + " " + box4);

        // System.out.println(box4.weight);
        /*
         * can not do this even though weight is initialized becouse
         * it is actually the type of the ref variable that determines
         * what members can be accessed
         */

        // BoxWeight box = new Box(1,2,3); error
        /*
         * there are many variables in both parent and child classes
         * you are given access to variables that are in ref type
         * i.e. BoxWeight hance, you should hava access to weight
         * variable this means, that ones you are trying to access
         * should be initialised
         * but here, when the obj itself is of type parent class, how
         * will you call constructor of child class
         * this is why error
         */

        BoxPrice box5 = new BoxPrice(5, 25, 200);
        System.out.println("BoxPrice class "+box5.cost);

        Box.greeting();
        // we can access greeting without creating object becouse it is static

    }
}
