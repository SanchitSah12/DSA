package OOPSCONCEPTS.polymorphism;

public class Shapes {
    void area(){
        System.out.println("Shapes Class");
    }
    final int area(int side){
        return side*side;
    }
    double area(int height, int base){
        return 1/2 * height *base;
    }
}
