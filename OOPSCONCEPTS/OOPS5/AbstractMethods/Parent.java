package OOPSCONCEPTS.OOPS5.AbstractMethods;

public abstract class Parent {
    public static void Hello() {
        System.out.println("Hello");
    }
    abstract void career(String name);
    abstract void partner(String name,int age);
}
