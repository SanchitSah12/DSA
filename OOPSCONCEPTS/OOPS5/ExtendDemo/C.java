package OOPSCONCEPTS.OOPS5.ExtendDemo;

public interface C {
    public void display(int n);
    //default method
    default int sum(int a,int b){
        return a+b;
    }

    static void greet(){
        System.out.println("Hello");
    }
}
