package OOPSCONCEPTS.OOPS6.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class CustomArrayList<T> {
    private  Object arr[];
    private static int DEFAULT_SIZE  = 10;
    private int size = 0;

    public boolean isFull(){
        return size == arr.length;
    }
    public CustomArrayList(){
        this.arr = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(this.isFull()){
            resize();
        }
        arr[size++] = num;
    }

    private void resize() {
        int ind = 0;
        Object[] temp = new Object[arr.length*2];
        for (Object i : arr) {
            temp[ind++] = (i);
        }

        arr = temp;
    }

    public T remove(){
        T removed = (T)arr[--size];
        return removed;
    }
    public T get(int ind){
        return (T)arr[ind];
    }
    public int size(){
        return size;
    }

    public void set(int index, T value){
        arr[index] = value;
    }

    @Override
    public String toString() {
        return "{" +
            " arr[]='" + Arrays.toString(arr) + "'" +
            ", size='" + size + "'" +
            "}";
    }

    //another example 
    public void getList(List<? extends Number> list){
        return;
    }

    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        l.add(45);

        CustomArrayList<Integer> a = new CustomArrayList();

        a.add(2);
        a.add(4);
        System.out.println(a);
    }
}
