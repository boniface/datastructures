package com.kabaso.datastructures.nonlinear.binarytree;

import com.kabaso.datastructures.Student;

public class Driver {
    public static void main(String[] args) {
        Student a = new Student.Builder().age(10).name("A").studentNumber(1).build();
        Student b = new Student.Builder().age(20).name("B").studentNumber(2).build();
        Student c = new Student.Builder().age(30).name("C").studentNumber(3).build();
        Student d = new Student.Builder().age(40).name("D").studentNumber(4).build();

        StudentBinaryTree sBtree= new StudentBinaryTree();
        sBtree.add(a);
        sBtree.add(b);
        sBtree.add(c);
        sBtree.add(d);
        System.out.println(" Pre-Order");
        sBtree.traversePreOrder(sBtree.root);
        System.out.println(" In-Order");
        sBtree.traverseInOrder(sBtree.root);
        System.out.println(" Post-Order");
        sBtree.traversePostOrder(sBtree.root);



    }
}
