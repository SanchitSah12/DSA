package OOPSCONCEPTS.OOPS5.AbstractMethods;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        Daughter daughter = new Daughter();

        son.career("Doctor");
        daughter.career("Iron Man");
        Parent.Hello();

        //we can d this
        Parent p = new Son();


        //we will need to define the class to do that
        // Parent dad = new Parent() {
        //     @Override
        //     protected String career() {
        //         return "Engineering";
        //     }

        //     @Override
        //     void partner(String name, int age) {
        //     }
        // };
    }
}
