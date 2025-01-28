package org.example.ADTs.QueueStacks;

public class StacksAndQueues {
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack(5);

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Peek: " + queue.peek()); // Output: 10
        System.out.println("Size: " + queue.size()); // Output: 3

        // Dequeue elements
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 10
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 20

        queue.enqueue(40);
        System.out.println("Peek: " + queue.peek()); // Output: 30
        System.out.println("Size: " + queue.size()); // Output: 2
    }

}
