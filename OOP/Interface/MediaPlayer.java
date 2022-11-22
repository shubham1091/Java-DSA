package OOP.Interface;

public class MediaPlayer implements Media {

    @Override
    public void start() {
       System.out.println("Music statrt");
        
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
        
    }
    
}
