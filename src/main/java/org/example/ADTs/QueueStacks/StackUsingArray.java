package org.example.ADTs.QueueStacks;

public class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;

    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int data) {
        if (top == capacity - 1) {
            throw new RuntimeException("StackOverflow: Cannot add element in stack");
        }
        stack[++top] = data;
    }

    public void pop(){
        if (top == -1) {
            throw new RuntimeException("StackUnderflow: Cannot remove element from stack");
        }
        top--;
    }

    public int peek(){
        if (top == -1) {
            throw new RuntimeException("Stack is empty, so cannot peek at value");
        } else {
            return stack[top];
        }
    }

    public int peekAndPop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty, so cannot peek at value");
        } else {
            return stack[top--];
        }
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
