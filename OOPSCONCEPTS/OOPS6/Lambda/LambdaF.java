package OOPSCONCEPTS.OOPS6.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaF {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            al.add(i);
        }

        Consumer<Integer> fun = (item)->{
            System.out.println(item*2);
        };
        al.forEach(fun);
        // //this is map of js
        // a.forEach((item)->{
        //     System.out.println(item*2);
        // });
        LambdaF bj = new LambdaF();
        Operation sum = (a,b) -> a+b;
        Operation sub = (a,b)  -> a-b;
        System.out.println(bj.operate(5,100,sum));
    }

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
    
    int sum(int a,int b){
        return a+b;
    }
}
interface Operation{
    int operation(int a, int b);
}
