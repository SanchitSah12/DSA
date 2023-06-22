package OOPS.StaticExample;

public class InnerClasses {
    // depends on object
    class Test {
        String name;

        public Test(String name) {
            this.name = name;
            System.out.println(this.name);
        }
    }

    static class Test2 {
        String name;

        public Test2(String name) {
            this.name = name;
            System.out.println(this.name);
        }
    }

    public static void main(String[] args) {
        Test2 a = new Test2("Sanchit");
        InnerClasses s = new InnerClasses();
        s.
    }
}
