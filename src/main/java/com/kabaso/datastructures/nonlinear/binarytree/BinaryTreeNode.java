package com.kabaso.datastructures.nonlinear.binarytree;

import com.kabaso.datastructures.Student;

public class BinaryTreeNode {

    Student data;
    BinaryTreeNode leftNode;
    BinaryTreeNode rightNode;

    BinaryTreeNode(Student  data) {
        this.data = data;
        rightNode = null;
        leftNode = null;
    }
}
