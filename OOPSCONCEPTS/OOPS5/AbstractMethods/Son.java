package OOPSCONCEPTS.OOPS5.AbstractMethods;

public class Son extends Parent {

    @Override
    void career(String name) {
        System.out.println("I am going to be a male "+ name);
    }
    
    @Override
    void partner(String name, int age) {
        System.out.println("I will choose her"+ name+ " age "+age);
    }

    
    
}
