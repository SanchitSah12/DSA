package OOPSCONCEPTS.OOPS2.OOPS.StaticExample;

import java.util.*;
public class Human{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    //create constructor
    public Human(int age, String name, int salary, boolean married) {
    this.age = age;
    this.name = name;
    this.salary = salary;
    this.married = married;
    Human.population+=1;
}

}