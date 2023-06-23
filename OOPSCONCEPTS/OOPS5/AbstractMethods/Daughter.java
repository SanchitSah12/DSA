
package OOPSCONCEPTS.OOPS5.AbstractMethods;

public class Daughter extends Parent {

    @Override
    void career(String name) {
        System.out.println("I am going to be a female "+ name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I will choose him his name is "+ name+ " age "+age);
    }

    
    
}
