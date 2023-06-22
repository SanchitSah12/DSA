package OOPS.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(20, "sanchit", 10000, false);
        Human h2 = new Human(20, "sanchit", 10000, false);
        System.out.println(Human.population);
        System.out.println(Human.population);

        Main m = new Main();
        m.greeting();

        // belongs to classs
        greetings();




        ///For Singleton
        Singleton obj = Singleton.getInstance(5);
        System.out.println(obj.n);
    }

    // belongs to object

    void greeting() {
        System.out.println("Hello World");
        greetings();
        greetingss();
    }

    // static //belongs to classs

    static void greetings() {
        System.out.println("Hello Worlds");
    }

void greetingss() {
        System.out.println("Hello Worldssss");
        greetings();
    }
    
}
