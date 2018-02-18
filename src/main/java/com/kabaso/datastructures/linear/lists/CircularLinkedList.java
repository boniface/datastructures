package com.kabaso.datastructures.linear.lists;

import com.kabaso.datastructures.Student;

public class CircularLinkedList {

    private static class Node {
        private Student data;
        private Node nextLink;

        public Node(Student data, Node next) {
            this.data = data;
            this.nextLink = next;
        }

        public Node(Student data) {
            this.data = data;
            this.nextLink = null;
        }
    }

    // In	the	circular linked	list,	we	just	need	the	pointer	to	the	tail	node.
    // As	head	node	can	beeasily	reached	from	tail	node

    private Node tail;
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
        return tail.nextLink.data;
    }

    // Node Insertion in a Linked List
    // 1. Insert	element	at	the	start

    public void addAtHead(Student data) {
        Node temp = new Node(data, null);
        if(isEmpty()){
            tail = temp;
            temp.nextLink = temp;
        }else{
            temp.nextLink=tail.nextLink;
            tail.nextLink = temp;
        }
        size++;
    }

    // Adding	node	at	the	end	is	same	as	adding	at	the	beginning.	Just	need	to	modify	tail
    //reference	in	place	of	the	head	reference.
    public void addToTail(Student data) {
        Node temp = new Node(data, null);
        if(isEmpty()){
            tail = temp;
            temp.nextLink = temp;
        }else{
            temp.nextLink=tail.nextLink;
            tail.nextLink = temp;
            tail = temp;
        }
        size++;
    }

    public Student removeHead() throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException(" List Empty");
        Student data = tail.nextLink.data;
        if(tail==tail.nextLink)
            tail = null;
        else
            tail.nextLink=tail.nextLink.nextLink;
        size --;
        return data;
    }

    public void deleteList(){
        tail = null;
        size = 0;
    }

    public boolean removeNode(Student data){
        if(isEmpty())
            return false;
        Node prev = tail;
        Node current = tail.nextLink;
        Node head = tail.nextLink;
        if(current.data==data){
            if(current==current.nextLink)
                tail = null;
            else
                tail.nextLink = tail.nextLink.nextLink;
            return true;
        }
        prev = current;
        current = current.nextLink;

        while(current!=head){
            if(current.data==data){
                if(current == tail)
                    tail = prev;
                prev.nextLink = current.nextLink;
                return true;
            }
            prev = current;
            current = current.nextLink;
        }
        return  false;
    }
    

    // TRAVERSE A LINKED LIST

    public void print() {
        if(isEmpty())
            return;
        Node temp = tail.nextLink;
        while (temp != null) {
            System.out.println(temp.data.getName() + ", " + temp.data.getStudentNumber() + ", ");
            temp = temp.nextLink;
        }
    }


}
