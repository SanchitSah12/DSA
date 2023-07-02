package OOPSCONCEPTS.OOPS5.ExtendDemo;

public class Main implements B{
    // both we will have to 
    @Override
    public void greet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'greet'");
    }

    @Override
    public void gun() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gun'");
    }


    public static void main(String[] args) {
        Defaultinplementation d = new Defaultinplementation();
        d.display(d.sum(4, 4));
        C.greet();
    }
    
}
