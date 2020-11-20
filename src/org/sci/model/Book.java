package org.sci.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {

    private int nrPages;
    private Double price;
    private String[] author;
    private String title;
    private String isbn;
    private String editura;
    private Novel Novel;

    public Book(String title){
        this.title = title;
    }

    public Book(int nrPages1){
        this.nrPages = nrPages1*100;
    }

    public Book(int nrPages1, String title){
        this(nrPages1);
        this.title = title;
    }

    public Book(){
        this(12,"title");
    }

    public int getNrPages() {
        return nrPages;
    }

    public void setNrPages(int nrPages) {
        this.nrPages = nrPages;
    }

    public String getEditura(){
        return this.editura + " by RaresC";
    }

    public void setEditura(String numeEditura){
        this.editura = numeEditura;
    }

    public Double getPrice() {
        return price;
    }

    public void setPret(Double price) {
        this.price = price;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object object){

        if (object == null ||  object.getClass() != getClass()) return false;
        Book receiveBook = (Book) object;

        boolean b = Objects.equals(this.price, receiveBook.price) &&
                Arrays.equals(this.author, receiveBook.author) &&
                Objects.equals(this.title, receiveBook.title) &&
                Objects.equals(this.isbn, receiveBook.isbn) &&
                Objects.equals(this.editura, receiveBook.editura);
        return b;

    }
}
