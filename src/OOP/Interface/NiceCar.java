package OOP.Interface;

public class NiceCar {
    private Engine engine;
    private Media palyer;

    public NiceCar() {
        this.engine = new PowerEngine();
        this.palyer = new MediaPlayer();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }

    public void stop() {
        this.engine.stop();
    }

    public void startMusic() {
        this.palyer.start();
    }

    public void stopMusic() {
        this.palyer.stop();
    }

    public void updradeEngine() {
        this.engine = new ElectricEngine();
    }
}
