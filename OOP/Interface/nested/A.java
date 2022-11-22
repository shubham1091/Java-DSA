package OOP.Interface.nested;

public class A {
    // nested interface
    public interface Nest {
        boolean isOdd(int num);
    }

}

class B implements A.Nest {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }

}
