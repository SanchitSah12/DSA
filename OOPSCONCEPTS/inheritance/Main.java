package OOPSCONCEPTS.inheritance;

import java.util.*;
class Main{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Box b = new Box(10,20,10);
        // System.out.println(b.l + " " + b.w + " " +b.h);
        // BoxWeight box3 = new BoxWeight();
        // BoxWeight b4 = new BoxWeight(10, 20, 30, 40);
        // System.out.println(box3.l + " " + box3.w + " " +box3.h+" "+box3.weight);
        // System.out.println(b4.l + " " + b4.w + " " +b4.h+" "+b4.weight);

        Box b5 = new BoxWeight(2, 3, 3, 4);//object is of BoxWeight type
        // System.out.println(b5.weight); cannot access weight
        Box.greeting();
    }
}