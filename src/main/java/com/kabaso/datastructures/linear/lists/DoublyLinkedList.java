package com.kabaso.datastructures.linear.lists;

import com.kabaso.datastructures.Student;

public class DoublyLinkedList {

    private static class Node {
        private Student data;
        private Node nextLink;
        private Node prevLink;

        public Node(Student data, Node nextLink, Node prevLink) {
            this.data = data;
            this.nextLink = nextLink;
            this.prevLink = prevLink;
        }

        public Node(Student data) {
            this.data = data;
            this.nextLink = null;
            this.prevLink = null;
        }
    }

    private Node head; // sometimes called top
    private Node tail;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Pick at the head

    public Student peek() {
        if (isEmpty())
            throw new IllegalStateException("Emmpty List Exception");
        return head.data;
    }

    // Node Insertion in a Doubly Linked List
    // 1. Insert	element	at	the	start

    public void addAtHead(Student data) {
        Node newNode = new Node(data);
        if (size() == 0)
            tail = head = newNode;
        else {
            head.prevLink = newNode;
            newNode.nextLink = head;
            head = newNode;
        }
        size++;
    }

    // 2. Insert	element	at	the	end
    public void addToTail(Student data) {
        Node newNode = new Node(data, null, null);
        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.prevLink = tail;
            tail.nextLink = newNode;
            tail = newNode;
        }
        size++;

    }
    // Remove head

    public Student removeHead() throws IllegalAccessException {
        if(isEmpty())
            throw new IllegalAccessException(" List is Empty");
        Student data = head.data;
        head = head.nextLink;
        if(head==null)
            tail = null;

        else
            head.prevLink=null;
        size--;
        return  data;
    }

    public boolean removeNode(Student data){
        Node current = head;
        if(current==null)
            return false;
        if(current.data == data){
            head = head.nextLink;
            size--;
            if(head==null)
                head.prevLink = null;
            else
                tail = null;
            return true;
        }

        while (current.nextLink!=null){
            if(current.nextLink.data==data){
                current.nextLink = current.nextLink.nextLink;
                if(current.nextLink == null)
                    tail =current;
                size--;
                return true;
            }
            current= current.nextLink;
        }
        return false;
    }

    public	void	deeleteList(){
        head	=	null;
        tail	=	null;
        size	=	0;
    }



    // 3. Insert	element	in	sorted	order


    // TRAVERSE A LINKED LIST

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.getName() + ", " + temp.data.getStudentNumber() + ", ");
            temp = temp.nextLink;
        }
    }


}
