package OOPSCONCEPTS.OOPS5.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player;
    public NiceCar(){
        engine = new PowerEngine();
        player = new CDplayer();
    }
    public NiceCar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
     public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upGradeEngine(){
        this.engine = new ElectricEngine();
    }
}
