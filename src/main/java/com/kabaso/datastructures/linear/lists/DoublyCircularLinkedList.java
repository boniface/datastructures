package com.kabaso.datastructures.linear.lists;

import com.kabaso.datastructures.Student;

public class DoublyCircularLinkedList {

    // Our Box
    private static class Node {
        private Student data;
        private Node nextLink;
        private Node prevLink;

        public Node(Student data, Node next, Node prev) {
            this.data = data;
            this.nextLink = next;
            this.nextLink = prev;
        }

        public Node(Student data) {
            this.data = data;
            this.nextLink = this;
            this.prevLink = this;
        }
    }


    private Node head = null;
    private Node tail = null;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Student peek() {
        if (isEmpty())
            throw new IllegalStateException("Emmpty List Exception");
        return head.data;
    }

    public void deleteList() {
        head = null;
        tail = null;
        size = 0;
    }


    // Node Insertion in a Linked List
    // 1. Insert	element	at	the	start

    public void addAtHead(Student data) {
        Node newNode = new Node(data, null, null);

        if (size() == 0) {
            tail = head = newNode;
            newNode.nextLink = newNode;
            newNode.prevLink = newNode;
        } else {
            newNode.nextLink = head;
            newNode.prevLink = head.prevLink;
            head.prevLink = newNode;
            newNode.prevLink.nextLink = newNode;
            head = newNode;
        }
        size++;
    }

    // 2. Insert	element	at	the	end
    public void addToTail(Student data) {
        Node newNode = new Node(data, null, null);
        if (size() == 0) {
            head = tail = newNode;
            newNode.nextLink = newNode;
            newNode.prevLink = newNode;
        } else {
            newNode.nextLink = tail.nextLink;
            newNode.prevLink = tail;
            tail.nextLink = newNode;
            newNode.nextLink.prevLink = newNode;
            tail = newNode;
        }
        size++;
    }

   // Delete head
    public Student deleteHead(){
        if(size()==0)
            throw new IllegalStateException(" List is Empty");
        Student data = head.data;
        size--;
        if(size() == 0){
            head = null;
            tail = null;
            return data;
        }
        Node nextNode = head.nextLink;
        nextNode.prevLink = tail;
        tail.nextLink = nextNode;
        head = nextNode;
        return data;
    }

    // Delete tail
    public Student deleteTail() {
        if(size()==0)
            throw new IllegalStateException(" List is Empty");
        Student data = tail.data;
        size--;
        if(size() == 0){
            head = null;
            tail = null;
            return data;
        }
        Node prevNode = tail.prevLink;
        prevNode.nextLink = head;
        head.prevLink = prevNode;
        tail = prevNode;
        return data;
    }

    // TRAVERSE A LINKED LIST

    public void print() {
        if (isEmpty()) {
            return;
        }
        Node temp = head;
        while (temp != tail) {
            System.out.println(temp.data.getName() + ", " + temp.data.getStudentNumber() + ", ");
            temp = temp.nextLink;
        }
    }
}
