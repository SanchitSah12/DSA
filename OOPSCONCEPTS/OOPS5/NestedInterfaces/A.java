package OOPSCONCEPTS.OOPS5.NestedInterfaces;

public interface A {
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int number) {
        return (number%2!=0);
}
}

