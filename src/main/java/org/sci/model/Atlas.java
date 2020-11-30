package org.sci.model;

public class Atlas extends Book{
    private String genre;
    private byte rating;
    private String publishhouse;



    public Atlas(String genre, String publishhouse){
        super(56,"Wold Map");
        this.genre = genre;
        this.publishhouse = publishhouse;
    }

    public String getPublishhouse() {
        return publishhouse;
    }

    public void setPublishhouse(String publishhouse) {
        this.publishhouse = publishhouse;
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
