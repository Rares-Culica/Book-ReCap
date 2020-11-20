package org.sci.model;

public class Atlas extends Book{
    private String genre;
    private byte rating;



    public Atlas(String genre){
        super(56,"Wold Map");
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
