package com.kabaso.datastructures.linear.lists;

import com.kabaso.datastructures.Student;

public class Driver {
    public static void main(String[] args) {
        Student a = new Student.Builder().age(10).name("A").studentNumber(1).build();
        Student b = new Student.Builder().age(20).name("B").studentNumber(2).build();
        Student c = new Student.Builder().age(30).name("C").studentNumber(3).build();

        SinglyLinkedList list = new SinglyLinkedList();
        list.addAtHead(a);
        System.out.println(" Print first results ");
        list.print();
        list.addToTail(b);
        System.out.println(" Print Second results  results ");
        list.print();
        list.addSorted(c);
        System.out.println(" Print Third  results ");
        list.print();
        list.addSorted(b);
        System.out.println(" Print Fourth  results ");
        list.print();

    }
}
