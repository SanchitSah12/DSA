package DataStructures.Queue;

public class OurQueue {
    static class Queue{
        int arr[];
        int size;
        int rear = -1;
        Queue(int size){
            arr = new int[size];
            this.size = size;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public void enqueue(int data){
            if(rear == size - 1){
                System.out.println("Full Queue");
                return;
            }
            arr[++rear] = data;
        }

        //dequeue
        public int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;

            }
            int front = arr[0];
            for (int i=0 ;i<rear;i++){
                arr[i]=arr[i+1];
            }
            return front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }
    static class CircularQueue extends  Queue{
        int front = -1;
        CircularQueue(int size) {
            super(size);
        }

        @Override
        public boolean isEmpty(){
            return front==-1 && rear==-1;
        }
        
        public boolean isFull(){
            return (rear+1) %size == front;
        }

        @Override
        public void enqueue(int data){
            if(isFull()){
                System.out.println("Full Queue");
                return;
            }

            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        @Override
        public int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;

            }
            int res = arr[front];
            if(rear == front){
                rear = front = -1;
            }
            else{
                front =(front + 1 )%size ; // circular queue implementation, so we need
            }
            return res;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }

    }
}
