package org.example.ADTs.LinkedLists;

public class LinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Introduce a cycle for testing
    public void createCycle(int pos) {
        if (pos < 0) return;

        Node<T> current = head;
        Node<T> cycleNode = null;
        int index = 0;

        while (current.next != null) {
            if (index == pos) {
                cycleNode = current;
            }
            current = current.next;
            index++;
        }

        if (cycleNode != null) {
            current.next = cycleNode; // Create the cycle
        }
    }

    public boolean hasCycle() {
        Node<T> fast = head;
        Node<T> slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public void reverse() {

        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;

        while(current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void print() {
        Node<T> current = head;
        while(current!=null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
