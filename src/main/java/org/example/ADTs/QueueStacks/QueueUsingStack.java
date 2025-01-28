package org.example.ADTs.QueueStacks;

public class QueueUsingStack {
    private StackUsingArray inputStack;
    private StackUsingArray outputStack;

    public QueueUsingStack(int capacity) {
        inputStack = new StackUsingArray(capacity);
        outputStack = new StackUsingArray(capacity);
    }

    public void enqueue(int data) {
        inputStack.push(data);
    }

    public int dequeue() {
        if(outputStack.isEmpty()) {
            if(inputStack.isEmpty()) {
                throw new RuntimeException("QueueUnderflow: Cannot remove element from queue");
            }
            while(!inputStack.isEmpty()) {
                outputStack.push(inputStack.peek());
                inputStack.pop();
            }
        }
        return outputStack.peekAndPop();
    }

    public int peek() {
        if(outputStack.isEmpty()) {
            if(inputStack.isEmpty()) {
                throw new RuntimeException("QueueUnderflow: Cannot remove element from queue");
            }
            while(!inputStack.isEmpty()) {
                outputStack.push(inputStack.peek());
                inputStack.pop();
            }
        }
        return outputStack.peek();
    }

    public int size() {
        return inputStack.size() + outputStack.size();
    }

    public boolean isEmpty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
