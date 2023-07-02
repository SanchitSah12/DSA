package OOPSCONCEPTS.OOPS5.interfaces;

public class Car implements Engine, Break,Media  {

    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start CAR like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop CAR like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("I acc like a normal car");

    }

}
