package OOPSCONCEPTS.OOPS3.inheritance;

import java.util.Objects;

public class Box {
    double h, w, l;

    Box() {
        super();
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double h, double w, double l) {
        this.h = h;
        this.w = w;
        this.l = l;
    }

    Box(Box old){
        this.h = old.h;
        this.w=old.w;
        this.l=old.l;
    }

    static void greeting()
{
    System.out.println("i AM IN BOX");
}
    public void displayInfo(){
        System.out.println("Running the Box");
    }
}
