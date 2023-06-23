package OOPSCONCEPTS.OOPS2.OOPS.StaticExample;

public class InitializationVar {
    static int a = 4;
    static int b;

    //static block will only run once when class is loaded for the first time
    static{
        System.out.println("Static Block");
        b = a*2;
    }
    public static void main(String[] args) {
        InitializationVar obj = new InitializationVar();
        System.out.println(a+ " "+ b);
        b = 3;
                System.out.println(a+ " "+ b);

    }
}
