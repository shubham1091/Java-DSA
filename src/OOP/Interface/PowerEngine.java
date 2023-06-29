package OOP.Interface;

public class PowerEngine implements Engine {

    @Override
    public void start() {
        System.err.println("PowerEngine start");
        
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine stop");
        
    }

    @Override
    public void acc() {
        System.out.println("PowerEngine accelerate");
        
    }
    
}
