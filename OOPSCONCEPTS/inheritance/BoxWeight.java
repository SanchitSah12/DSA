package OOPSCONCEPTS.inheritance;

import java.util.*;
class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight (BoxWeight other){
        super(other);
        this.w = other.weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(h, w, l); //call the parent class constructor
        this.weight = weight;
    }

    
    

    
}