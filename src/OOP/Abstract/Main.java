package OOP.Abstract;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        son.career("programmer");
        Daughter daughter = new Daughter(19);
        daughter.partner("shubham");
        Parent.hello();
    }

}
