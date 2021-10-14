package com.softwareInstitute.training.varan.agash;

public class AudioBooks extends DigitalItems{
    //Attributes
    private String title;
    private String author;


    //Constructors
    public AudioBooks(String title, String author, String libraryItemType){
        super(libraryItemType);
        this.title = title;
        this.author = author;
    }

    public AudioBooks(String title, String author){
        super("AudioBook");
        this.title = title;
        this.author = author;
    }


    //Methods
    public String use(){
        return "override with play for audiobook";
    }

    public String reserve(){
        return "this audiobook has been reserved";
    }

    public String play(){
        return "Playing audiobook";
    }

    public String borrow(){
        return "audiobook sent to email.";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
