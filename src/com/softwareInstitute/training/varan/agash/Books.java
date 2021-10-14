package com.softwareInstitute.training.varan.agash;

public class Books extends AnalogueItems{
    //Attributes
    private String title;
    private String author;

    //Constructors
    public Books(String title, String author,String libraryItemName){
        super("Book");
        this.title = title;
        this.author = author;
    }

    public Books(String title, String author){
        super("Book");
        this.title = title;
        this.author = author;
    }

    public Books(String title){
        super("Book");
        this.title = title;
        this.author = "Unknown";
    }

    public Books(){
        super("Book");
        this.title = "Unknown";
        this.author = "Unknown";
    }

    //Methods
    public String readBlurb(){
        return "blurb blurb nice blurb";
    }

    public String use(){
        return "override this with read for books";
    }

    public String reserve(){
        return "this book has been reserved";
    }

    public String getLibraryItemName() {
        return title;
    }

    public String flickThrough(){
        return "flicking through book...done.";
    }

    public String borrow(){
        return "book is loaned to you for a week";
    }

    public String read(){
        return "reading book...start.";
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
