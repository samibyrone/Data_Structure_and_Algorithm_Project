package StackTask;

public class Stack {

    private String [] stack;
    private int size;
    private int element;

    public Stack(int capacity) {
        element = capacity;
        stack = new String[element];
        size = - 1;
    }

    public boolean isEmpty() {
        return size == - 1;
    }

    public boolean isFull() {
        return size == element - 1;
    }

    public void push(String element) {
        if(!isFull()) {
            stack[++size] = element;
        }else {
            System.out.println("Stack is full");
        }
    }

    public String pop() {
        return isEmpty() ? null : stack[size--];
    }

    public String peek() {
        return isEmpty() ? null : stack[size];
    }

    public int size() {
        return size + 1;
    }
}