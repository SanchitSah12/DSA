package OOPSCONCEPTS.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes sh = new Shapes();
        Circle circle = new Circle();
        Triangle tri = new Triangle();

        Shapes tri2 = new Triangle();  
        tri.area();

        //Polymorphism
        sh.area(12, 2);
        sh.area(2);

    }
}
