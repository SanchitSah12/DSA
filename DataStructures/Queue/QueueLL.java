package DataStructures.Queue;

public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if(tail == null){
            tail = head = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // dequeue
    public int remove() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;

        }
        
        int data = head.data;
        if(head == null){
            tail = null;

        }
        head = head.next;
        return head.data;
    }

    // public int peek() {
    //     if (isEmpty()) {
    //         System.out.println("Empty Queue");
    //         return -1;
    //     }
    //     return arr[0];
    // }
}
