package com.kabaso.datastructures.linear.lists;

import com.kabaso.datastructures.Student;

public class DoublyCircularLinkedList {
    private static class Node {
        private Student data;
        private SinglyLinkedList.Node nextLink;

        public Node(Student data, SinglyLinkedList.Node next) {
            this.data = data;
            this.nextLink = next;
        }

        public Node(Student data) {
            this.data = data;
            this.nextLink = null;
        }
    }

    private SinglyLinkedList.Node head; // sometimes called top
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Node Insertion in a Linked List
    // 1. Insert	element	at	the	start

    public void addAtHead(Student data) {
        head = new SinglyLinkedList.Node(data, head);
        size++;
    }

    // 2. Insert	element	at	the	end
    public void addToTail(Student data) {
        SinglyLinkedList.Node newNode = new SinglyLinkedList.Node(data);
        SinglyLinkedList.Node curr = head;

        if (head == null)
            head = newNode;

        while (curr.nextLink != null) {
            curr = curr.nextLink;
        }
        curr.nextLink = newNode;

    }
    // 3. Insert	of	an	element	at	the	Nth position

    SinglyLinkedList.Node InsertNth(Student data, int position) {
        SinglyLinkedList.Node node = head;
        if (position == 0) {
            node = new SinglyLinkedList.Node(data, head);
            return node;
        } else {
            while (--position > 0) {
                node = node.nextLink;
            }
            SinglyLinkedList.Node next = node.nextLink;
            node.nextLink = new SinglyLinkedList.Node(data, next);
            return head;
        }
    }


    // 3. Insert	element	in	sorted	order

    public void addSorted(Student data) {
        SinglyLinkedList.Node newNode = new SinglyLinkedList.Node(data);
        SinglyLinkedList.Node curr = head;

        if (curr.nextLink == null || curr.data.getStudentNumber() > data.getStudentNumber()) {
            newNode.nextLink = head;
            return;
        }

        while (curr.nextLink != null && curr.nextLink.data.getStudentNumber() < data.getStudentNumber()) {
            curr = curr.nextLink;
        }

        newNode.nextLink = curr.nextLink;
        curr.nextLink = newNode;
    }

    // TRAVERSE A LINKED LIST

    public void print() {
        SinglyLinkedList.Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.getName() + ", " + temp.data.getStudentNumber() + ", ");
            temp = temp.nextLink;
        }
    }


}
