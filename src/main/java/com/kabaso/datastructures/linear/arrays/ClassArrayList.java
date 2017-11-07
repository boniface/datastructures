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

        List bagAllowingDuplicates = new ArrayList();
        bagAllowingDuplicates.add(b1);
        bagAllowingDuplicates.add(b2);
        bagAllowingDuplicates.add(b3);
        bagAllowingDuplicates.add(b4);

        System.out.println("The Items ina List is "+bagAllowingDuplicates.size());


        Set nodupsbag = new HashSet();
        nodupsbag.add(b1);
        nodupsbag.add(b2);
        nodupsbag.add(b3);
        nodupsbag.add(b4);

        System.out.println("The Items ina Set is  "+nodupsbag.size());

    }


}
