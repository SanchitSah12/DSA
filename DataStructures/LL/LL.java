package DataStructures.LL;

public class LL {

    protected Node head;
    protected int size;

    LL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            // size++;
        }

    }


    public int search(int num){
        Node temp = head;
        int index = 0;
        while (temp!=null) {
            if(temp.data == num){
                return index;
            }
            temp= temp.next;
            index++;
        }
        return -1;
    }
    // add first
    public void addFirst(int value) {
        Node newNode = new Node(value);
        size++;
        if (head == null) {
            head = newNode;
            
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // add last
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    // public void insert()
    public void display() {
        Node next = head;
        while (next != null) {
            System.out.print(next.data + "->");
            next = next.next;
        }
        System.out.println("End");
    }

    public void insertInIndex(int index, int data) {
        if (index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // Delete First
    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int getSize() {
        return this.size;
    }

    // delete last
    public int deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        size--;
        if (head.next == null) {
            head = null;
            return -1;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int data = temp.next.data;
        temp.next = null;
        return data;
    }

    //delete in index
    public int deleteInIndex(int i){
        if(i == 0){
            return deleteFirst();
        }
        if(i == size-1){
            return deleteLast();
        }
        if (i > size || i < 0) {
            System.out.println("Invalid Index value");
            return -1;
        }
        size--;
        Node temp = head;
        int ind = 0;
        while(temp!=null){
            if(ind == i-1){
                int data = temp.next.data;
                temp.next = temp.next.next;
                return data;
            }
            temp = temp.next;
            ind++;
        }
        return -1;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(10);
        System.out.println(list.getSize());

        list.addFirst(5);
        System.out.println(list.getSize());

        list.addFirst(16);
        System.out.println(list.getSize());
        list.addFirst(1);
        System.out.println(list.getSize());

        list.addLast(5);
        System.out.println(list.getSize());

        list.deleteFirst();
        list.deleteLast();
        list.display();
        list.insertInIndex(3, 100);
        list.insertInIndex(3, 400);
        list.display();
        System.out.println(list.getSize());
        list.deleteInIndex(3);
        list.display();
        

        LL list2 = new LL();
        for(int i = 0; i< 50; i++){
            list2.addLast(i);
        }

        

    }
}
