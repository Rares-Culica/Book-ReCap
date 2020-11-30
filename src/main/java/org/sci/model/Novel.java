package org.sci.model;

public class Novel extends Book{
    private String genre;
    private byte rating;



    public Novel(String genre){
        super(128,"Supernatural");
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
