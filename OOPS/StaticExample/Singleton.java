package OOPS.StaticExample;

public class Singleton {
    int n;
    // can only create 1 object
    private Singleton(int n) {
        this.n = n;
    }   

    private static Singleton instance;

    public static Singleton getInstance(int n) {
        if (instance == null) {
            instance = new Singleton(n);
        }
        return instance;
    }
}
