package DataStructures.Stack;

import java.util.Stack;

public class Question {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(9);
        s.push(8);
        System.out.println(s);
        // pushAtBottom(100, s);
        reverse(s);
        System.out.println(s);

    }
}
