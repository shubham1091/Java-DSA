package OOP.Interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.acc();
        car.start();
        car.stop();

        NiceCar nice = new NiceCar();
        

        nice.start();
        nice.startMusic();
        nice.updradeEngine();
        nice.start();
    }

}
