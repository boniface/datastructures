package com.kabaso.datastructures.nonlinear.binarytree;

import com.kabaso.datastructures.Student;

public class StudentBinaryTree {

    // Will add all ADTs/Operations Method here
    BinaryTreeNode root;
    ////...

    ///..rest of the code

    private BinaryTreeNode addRecursive(BinaryTreeNode node, Student data) {
        if (node == null) {
            return new BinaryTreeNode(data);
        }
        if (data.getStudentNumber() < node.data.getStudentNumber()) {
            node.leftNode = addRecursive(node.leftNode, data);
        } else if (data.getStudentNumber() > node.data.getStudentNumber()) {
            node.rightNode = addRecursive(node.rightNode, data);
        } else {
            return node;
        }
        return node;
    }


    public void add(Student data) {
        root = addRecursive(root, data);
    }


    private boolean containsNodeRecursive(BinaryTreeNode node, Student data) {
        if (node == null) {
            return false;
        }
        if (data.getStudentNumber() == node.data.getStudentNumber()) {
            return true;
        }
        return data.getStudentNumber() < node.data.getStudentNumber()
                ? containsNodeRecursive(node.leftNode, data)
                : containsNodeRecursive(node.rightNode, data);
    }


    public boolean containsNode(Student data) {
        return containsNodeRecursive(root, data);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getSize() {
        return getSizeRecursive(root);
    }

    private int getSizeRecursive(BinaryTreeNode node) {
        return node == null ?
                0 : getSizeRecursive(node.leftNode) + 1 + getSizeRecursive(node.rightNode);
    }

    private BinaryTreeNode deleteRecursive(BinaryTreeNode node, Student data) {
        if (node == null) {
            return null;
        }
        if (data.getStudentNumber() == node.data.getStudentNumber()) {
            // Node to delete found
            // There are Three OPTIONS SEE NEXT SLIDE
            // Case 1: no children
            if (node.leftNode == null && node.rightNode == null) {
                return null;
            }

            // Case 2: only 1 child
            if (node.rightNode == null) {
                return node.leftNode;
            }

            if (node.leftNode == null) {
                return node.rightNode;
            }

            // Case 3: 2 children
            Student smallestValue = findSmallestValue(node.rightNode);
            node.data = smallestValue;
            node.rightNode = deleteRecursive(node.rightNode, smallestValue);
            return node;

        }
        if (data.getStudentNumber() == node.data.getStudentNumber()) {
            node.leftNode = deleteRecursive(node.leftNode, data);
            return node;
        }
        node.rightNode = deleteRecursive(node.rightNode, data);
        return node;
    }

    private Student findSmallestValue(BinaryTreeNode root) {
        return root.leftNode == null ? root.data : findSmallestValue(root.leftNode);
    }


    public void traverseInOrder(BinaryTreeNode node) {
        if (node != null) {
            traverseInOrder(node.leftNode);
            System.out.print(" " + node.data.getStudentNumber());
            traverseInOrder(node.rightNode);
        }
    }

    public void traversePreOrder(BinaryTreeNode node) {
        if (node != null) {
            System.out.print(" " + node.data.getStudentNumber());
            traversePreOrder(node.leftNode);
            traversePreOrder(node.rightNode);
        }
    }

    public void traversePostOrder(BinaryTreeNode node) {
        if (node != null) {
            traversePostOrder(node.leftNode);
            traversePostOrder(node.rightNode);
            System.out.print(" " + node.data.getStudentNumber());
        }
    }
}
