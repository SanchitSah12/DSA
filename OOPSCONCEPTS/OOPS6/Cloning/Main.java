package OOPSCONCEPTS.OOPS6.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sanc = new Human(21,"Sanchit");
        // Human twin = new Human(sanc); 
        //Exact copy of out method

        Human twin = (Human)sanc.clone(); //shallow copy
        System.out.println(twin.age+" "+ twin.name+" " +Arrays.toString(twin.arr));
        sanc.arr[0] = 100; //both arr obj reference point to same reference;
        System.out.println(twin.age+" "+ twin.name+""+Arrays.toString(twin.arr) );

        
    }
}
