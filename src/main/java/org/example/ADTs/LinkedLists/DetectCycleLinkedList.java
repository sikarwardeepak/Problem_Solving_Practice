package org.example.ADTs.LinkedLists;


public class DetectCycleLinkedList {

    //Detect a cycle in a linked list (Floyd’s Cycle Detection)
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.createCycle(2);

        if (linkedList.hasCycle()) {
           System.out.println("Cycle detected in linked list");
        } else {
            System.out.println("Cycle not detected in linked list");
        }
    }
}
