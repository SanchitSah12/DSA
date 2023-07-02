package DataStructures.LL;

public class Reverse extends LL{
    public void reverseIterate(){
        
        if(head == null || head.next == null){
            return;
        }
        
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    private Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public void reverseRecursive(){
        head =  reverseRecursive(head);
    }

    public static void main(String[] args) {
        Reverse list = new Reverse();
        list.addFirst(1);

        list.addFirst(2);


        list.addFirst(3);

        list.addFirst(4);


        // list.addLast(5);
        list.display();
        list.reverseIterate();
        list.display();

        list.reverseRecursive();
        list.display();
    }
}
