package com.test.ds.work;

public class SingleLinkedList {
    Node head = null;
    Node tail = null;
    public static class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
        }
    }

    public void createNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.createNode(10);
        singleLinkedList.createNode(20);
        singleLinkedList.createNode(30);
        singleLinkedList.createNode(40);
        singleLinkedList.display();
    }

    public void display() {
        Node current = head;
        if(current == null) {
            System.out.println(" SingleLinked list is empty :: ");
            return;
        }
        while (current != null) {
            System.out.println( "data of each node :: " +current.data);
            current = current.next;
        }
        System.out.println();
    }
}
