/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures_homework;

/**
 *
 * @author BenitoKriel
 */
public class LinkyList {
    
    
    private static class Node {
        private Company data;
        private Node nextLink;

        public Node(Company data, Node next) {
            this.data = data;
            this.nextLink = next;
        }

        public Node(Company data) {
            this.data = data;
            this.nextLink = null;
        }
    
    
    }
    
     private Node head; // sometimes called top
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Node Insertion in a Linked List
    // 1. Insert	element	at	the	start

    public void addAtHead(Company data) {
        head = new Node(data, head);
        size++;
    }
    
     public void addToTail(Company data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (head == null)
            head = newNode;

        while (curr.nextLink != null) {
            curr = curr.nextLink;
        }
        curr.nextLink = newNode;

    }
    
    Node InsertNth(Company data, int position) {
        Node node = head;
        if (position == 0) {
            node = new Node(data, head);
            return node;
        } else {
            while (--position > 0) {
                node = node.nextLink;
            }
            Node next = node.nextLink;
            node.nextLink = new Node(data, next);
            return head;
        }
    }
    
     public void addSorted(Company data) {
        Node newNode = new Node(data);
        Node curr = head;

        if (curr.nextLink == null || curr.data.getCompNum() > data.getCompNum()) {
            newNode.nextLink = head;
            return;
        }

        while (curr.nextLink != null && curr.nextLink.data.getCompNum() < data.getCompNum()) {
            curr = curr.nextLink;
        }

        newNode.nextLink = curr.nextLink;
        curr.nextLink = newNode;
    }

    // TRAVERSE A LINKED LIST

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.getCompName() + ", " + temp.data.getCompNum() + ", ");
            temp = temp.nextLink;
        }
    
    }
    
}
