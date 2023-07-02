package OOPSCONCEPTS.OOPS6.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        try {
            // divide(10, 0);
            if (a == 0)
                throw new MyException("Dead");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will run");
        }

    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Do not divide by 0");

        }
        return a / b;
    }
}
