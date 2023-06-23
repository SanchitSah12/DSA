package OOPSCONCEPTS.OOPS3.encaptulation;

import OOPSCONCEPTS.OOPS4.AccessControl.A;

public class Main extends A{
    Main(){
        super(5, "Sanchit");
    }
    public static void main(String[] args) {
        Main a = new Main();
        int b = a.num;
        System.out.println(a.num); // Works
    }
}
