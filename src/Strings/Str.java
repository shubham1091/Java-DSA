package Strings;

public class Str {
    public static void main(String[] args) {
        // String are immutable in java and mannaged by string pool
        String name = "shubham";
        String name2 = "shubham";
        String name3 = new String("shubham");
        // to check equality in string
        System.out.println(name == name3);// this will check the location
        System.out.println(name == name2);
        System.out.println(name.equals(name2));// this will check value
        // to get character at index
        System.out.println(name.charAt(2));
        System.out.println(name + name2);
    }

}
