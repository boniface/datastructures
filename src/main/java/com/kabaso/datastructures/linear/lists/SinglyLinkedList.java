package com.kabaso.datastructures.linear.lists;

import com.kabaso.datastructures.Student;

public class SinglyLinkedList {

    private static class Node {
        private Student data;
        private Node nextLink;

        public Node(Student data, Node next) {
            this.data = data;
            this.nextLink = next;
        }

        public Node(Student data) {
            this.data = data;
            this.nextLink =null;
        }
    }

    private Node head; // sometimes called top
    private int size;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    // Node Insertion in a Linked List
    // 1. Insert	element	at	the	start

    public void addAtHead(Student data){
        head = new Node(data,head);
        size++;
    }

    // 2. Insert	element	at	the	end
    public void addToTail(Student data){
        Node newNode = new Node(data,null);
        Node curr = head;

        if(head==null)
            head=newNode;

        while (curr.nextLink!=null){
            curr=curr.nextLink;
        }
        curr.nextLink=newNode;

    }
    // 3. Insert	of	an	element	at	the	Nth position

    Node InsertNth(Node head, Student data, int position) {
        Node node = head;
        if (position == 0){
            node = new Node(data,head);
            return node;
        }
        else {
            while(--position > 0){
                node = node.nextLink;
            }
            Node i = node.nextLink;
            node.nextLink =  new Node(data,i);
            return head;
        }
    }


    // 3. Insert	element	in	sorted	order

    public void addSorted(Student data){
        Node newNode = new Node(data, null);
        Node curr = head;

        if(curr.nextLink==null || curr.data.getStudentNumber() > data.getStudentNumber()){
            newNode.nextLink =head;
            return;
        }

        while (curr.nextLink!=null && curr.nextLink.data.getStudentNumber() < data.getStudentNumber()){
            curr = curr.nextLink;
        }

        newNode.nextLink=curr.nextLink;
        curr.nextLink=newNode;
    }


    // TRAVERSE A LINKED LIST

    public void print(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data.getName()+", "+temp.data.getStudentNumber()+", ");
            temp=temp.nextLink;
        }
    }


}
