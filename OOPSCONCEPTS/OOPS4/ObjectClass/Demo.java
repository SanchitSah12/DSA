package OOPSCONCEPTS.OOPS4.ObjectClass;
import java.util.Objects;

public class Demo {

    public Demo() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Demo)) {
            return false;
        }
        Demo demo = (Demo) o;
        return Objects.equals(this, demo);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "{" +
            "}";
    }
    
}
