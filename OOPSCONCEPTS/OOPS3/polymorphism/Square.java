package OOPSCONCEPTS.OOPS3.polymorphism;

public class Square extends Shapes{
    //this will run when obj of sq will be created
    //hence it overrides the parent method
    @Override//annotation 
    // to check method is being overridden
    void area(){
        System.out.println("side * side");
    }
}
