package DataStructures.Stack;

import java.security.PublicKey;
import java.util.ArrayList;

public class StackClass {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }
    }

    static class Stack {
        private Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head; // new node points to the current top of stack (old first
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int data = head.data;
            head = head.next;
            return data;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println("|" + temp.data + "|");
                temp = temp.next;
            }
            System.out.println("end");
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data;
        }
    }

    static class ALStack {
        ArrayList<Integer> al = new ArrayList<>();

        public boolean isEmpty() {
            return al.isEmpty();
        }

        public void push(int data) {
            al.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = al.get(al.size() - 1);
            al.remove(al.size() - 1);
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return al.get(al.size() - 1);
        }

        public void display() {
            int i = al.size()-1;
            while ( i >= 0) {
                System.out.println("|" + al.get(i) + "|");
                i--;
            }
            System.out.println("End");
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(0);
        s1.push(1);
        s1.push(2);
        s1.push(4);
        s1.push(5);
        s1.display();
        s1.pop();

        s1.display();

        ALStack al = new ALStack();
        al.push(3);
        al.push(4);
        al.push(5);
        al.push(6);
        al.display();
    }
}
