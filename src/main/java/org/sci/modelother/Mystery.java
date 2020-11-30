package org.sci.modelother;

import org.sci.model.Book;

public class Mystery extends Book {
    private String genre;
    private byte rating;

    public Mystery(String genre){
        super(234,"The Sentinel");
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
    }


}
