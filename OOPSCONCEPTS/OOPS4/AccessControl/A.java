package OOPSCONCEPTS.OOPS4.AccessControl;

public class A {
    protected int num;
    private String name;
    private int[] arr;
   
    //protected example in encaptulation package

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
    // public int getNum(){
    //     return num;
    // }
    
    // public void setNum(int num) {
    //     this.num = num;
    // }

}
