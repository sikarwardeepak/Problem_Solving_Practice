package org.example.ADTs.LinkedLists;

public class ReverseLinkedList {
    //Reverse a linked list
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.print();
        linkedList.reverse();
        linkedList.print();
    }
}
