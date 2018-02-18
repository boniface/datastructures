package com.kabaso.datastructures.linear.arrays;

import com.kabaso.datastructures.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassArrayList {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setIsdn(1);
        b1.setTitle("Java 9");

        Book b2 = new Book();
        b2.setIsdn(2);
        b2.setTitle("Java 8");

        Book b3 = new Book();
        b3.setIsdn(3);
        b3.setTitle("Java 7");

        Book b4 = new Book();
        b4.setIsdn(3);
        b4.setTitle("Java 6");

        // initialise and Add
        Book books[] = new Book[4];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;

        // Print The Results
        for (Book book : books) {
            System.out.println(" The Book is " + book.getTitle());
        }

        // Multi-Dimension

        Book multibooks[][][][] = new Book[4][2][2][1];
        multibooks[0][0][0][0] = b1;
        for (Book[][][] multibook : multibooks) {
            for (Book[][] books1 : multibook) {
                for (Book[] books2 : books1) {
                    for (Book book : books2) {
                        if (book != null)
                            System.out.println(" The Book is title is " + book.getTitle());
                    }
                }
            }
        }

    }
}
