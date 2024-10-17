package LinkedListTask;

public class LinkedList{
    Node head;

    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(head == null) { head = newNode;
        } else { Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            } temp.next = newNode;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean contains(int value){
        Node current = head;
        while(current != null) {
            if(current.value == value) {
                return true;
            } current = current.next;
        } return false;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public LinkedList clone(){
        LinkedList clonedList = new LinkedList();
        Node current = head;
        while(current != null) {
            clonedList.add(current.value);
            current = current.next;
        } return clonedList;
    }

    public void remove(int value){
        Node current = head, prev = null;
        while(current != null && current.value != value) {
            prev = current; current = current.next;
        } if(current != null) { if(prev != null) {
                prev.next = current.next;
            } else { head = current.next; }
        }
    }

    public void clear(){
        head = null;
    }

    public void set(int value, int index){
        Node current = head;
        int counter = 0;
        while(current != null){
            if(counter == index) { current.value = value;
                return;
            } counter++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public int get(int value){
        Node current = head;
        int counter = 0;
        while(current != null){
            if(counter == value) {
                return current.value;
            } counter++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public int size(){
        int counter = 0;
        Node current = head;
        while(current != null){
            counter++;
            current = current.next;
        }
        return counter;
    }

    public void offer(int value){
        add(value);
    }

    public int pop(){
        if(head != null) {
            int value = head.value;
            head = head.next;
            return value;
        }
        throw new IndexOutOfBoundsException("List is empty");
    }
po
    public Integer poll(){
        if(head != null) { int value = head.value;
            head = head.next;
            return value;
        } return null;
    }

    public Integer peek(){
        return head != null ? head.value : null;
    }

    public int element(){
        if(head != null) { return head.value; }
        throw new IndexOutOfBoundsException("List is empty");
    }
}
