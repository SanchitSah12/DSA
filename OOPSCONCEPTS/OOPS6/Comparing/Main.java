package OOPSCONCEPTS.OOPS6.Comparing;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(10, 20);
        Student s2 = new Student(5, 10);

        if (s1.compareTo(s2) > 0) {
            System.out.println("s1 is greater");
        }
        System.out.println(s1);
    }
}
