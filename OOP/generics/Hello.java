package OOP.generics;

public class Hello implements GenInterface<Integer> {
    public static void main(String[] args) {
        CustomArrayList list1 = new CustomArrayList();
        // in this we can pass parameters
        GenArrayList<Integer> list2 = new GenArrayList<>();
        // in this we can only pass some specific parameters
        WildCard<Float> list3 = new WildCard<>();
        for (int i = 1; i < 6; i++) {
            list1.add(i);
            list2.add(i);
            list3.add((float) i);
        }
        System.out.println(list1 + "\n");
        System.out.println(list2 + "\n");
        System.out.println(list3 + "\n");
        Hello obj = new Hello();
        obj.display(123);

    }

    @Override
    public void display(Integer value) {
        System.out.println(value);

    }

}
