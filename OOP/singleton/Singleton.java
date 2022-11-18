package OOP.singleton;

public class Singleton {
    String name;
    //we will talk about private latter
    private Singleton(String name) {
        this.name = name;
    }

    private static Singleton instance;

    public static Singleton geInstance(String name) {
        // check wether 1 obj only is created or not
        if (instance == null) {
            instance = new Singleton(name);
        }
        return instance;

    }
}
