package OOPSCONCEPTS.OOPS5.interfaces;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // //we can do 
        // Engine carr = new Car();
        
        // car.brake();
        // car.start();

        // Media m = new Car();
        // m.start();


        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upGradeEngine();
        car.start();
    }
}
