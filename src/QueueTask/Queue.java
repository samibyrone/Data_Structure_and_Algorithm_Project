package QueueTask;

public class Queue {

    private String [] queue;
    private int front;
    private int rear;
    private int size;
    private int implementation;

    public Queue(int implementation) {
        this.implementation = implementation;
        queue = new String[implementation];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean add(String content){
        if(size == implementation){
            myIplementation(implementation * 2);
        }
        rear = (rear + 1) % implementation;
        queue[rear] = content;
        size++;
        return true;
    }

    private void myIplementation(int implement) {
        if(implement == implementation){
            String[] temp = new String[implement];
            for(int index = 0; index < size; index++){
                temp[index] = queue[(front + index) % implementation];
            }
            front = 0;
            rear = size - 1;
            implementation = implement;
            queue = temp;
        }
    }

    public int size(){
        return size;
    }

    public boolean offer(String content) {
        if(size == implementation){
            myIplementation(implementation * 2);
        }
        rear = (rear + 1) % implementation;
        queue[rear] = content;
        size++;
        return true;
    }

    public boolean contains(String content){
        for(int index = 0; index < size; index++){
            if(queue[(front + index) % implementation].equals(content)){
                return true;
            }
        }
        return false;
    }

    public String remove() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
        String content = queue[front];
        queue[front] = null;
        front = (front + 1) % implementation;
        size--;
        return content;
    }

    public String poll(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
        String content = queue[front];
        queue[front] = null;
        front = (front + 1) % implementation;
        size--;
        return content;
    }

    public String peek() {
        return isEmpty() ? null : queue[front];
    }

}
