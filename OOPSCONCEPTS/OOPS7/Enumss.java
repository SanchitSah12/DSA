package OOPSCONCEPTS.OOPS7;

public class Enumss {
    enum Week implements A{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
        Week(){
            System.out.println("Constructor fot enum"+this);
        }
        //internally public static final Week Monday = new Week();
        //this constructor is not public or protected
        //only public and default;
        //cus we dont want to create new objects

        @Override
        public void greet() {
            System.out.println("Hello"+this);
        }
    }
    public static void main(String[] args) {
     
           //ENUM CONSTANTS //PUBLIC STATIC FINAL
        Week week;
        week = Week.WEDNESDAY;
        for (Week day : Week.values()) {
            System.out.println(day);
        }
        System.out.println(week.ordinal());
        week.greet();
        
    }
}
