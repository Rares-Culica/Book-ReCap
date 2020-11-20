package org.sci;

import org.sci.model.Book;
import org.sci.model.Novel;

public class Main {


        public static void main(String[] args) {

            Book book1 = new Book();
            book1.setEditura("RAMIRA ");


            Book book2 = new Book();
            book2.setEditura("HUMANITAS ");


            Book book3 = new Book();
            book3.setEditura("HUMANITAS ");

            Book b12 = new Book(121, "Reptile");

            Novel novel = new Novel("Fiction");





            System.out.println("cartile sunt egale: " + book2.equals(book3));
            System.out.println("editura 1: " + book1.getEditura());
            System.out.println("editura 2: " + book2.getEditura());
            System.out.println(novel.getGenre());
        }
    }
