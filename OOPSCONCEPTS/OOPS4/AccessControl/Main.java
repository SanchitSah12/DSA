package OOPSCONCEPTS.OOPS4.AccessControl;

public class Main {
    public static void main(String[] args) {
        A obj = new A(12, "Sanchit");
        System.err.println();

        //access and modify data members;
        // not good practice to do 
        // obj.num = 10;

        // System.out.println(obj.getNum()); //method can be accessed as it is public
        // and variables are private
    }
}
