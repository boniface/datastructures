package com.kabaso.datastructures.nonlinear;

public class Driver {
    public static void main(String[] args) {
        System.out.println(" Hello World ");
        Book book1 = new Book();
        book1.setId("1");
        book1.setName("JAVA");

        Book book2 = new Book();
        book2.setId("2");
        book2.setName("GOLANG");

        Book book3 = new Book();
        book3.setId("3");
        book3.setName("PHP");

        Book book4 = new Book();
        book4.setId("4");
        book4.setName("SCALA");

        Book book5 = new Book();
        book5.setId("5");
        book5.setName("C#");

        Book[] books = {book1,book2,book3,book4,book5};

        Graph graph = new Graph();
        graph.setId("2");
        graph.setBook(books);

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(" The name of the Book is "+ book.getName()+" And the ID is "+book.getId());
        }

    }
}
