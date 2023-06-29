package OOP.access;

public class A {
    private int num;
    protected int n;
    public String name;
    float data;
    int[] arr;

    public A(int num, String name, float data) {
        this.num = num;
        this.n = num;
        this.name = name;
        this.arr = new int[num];
        this.data = data;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
