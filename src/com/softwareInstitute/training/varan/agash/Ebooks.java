package com.softwareInstitute.training.varan.agash;

public class Ebooks extends DigitalItems implements Read {
    //Attributes
    private String title;
    private String author;


    //Constructors
    public Ebooks(String title, String author, String libraryItemType){
        super(libraryItemType);
        this.title = title;
        this.author = author;
    }

    public Ebooks(String title, String author){
        super("EBook");
        this.title = title;
        this.author = author;
    }

    //Methods
    public String use(){
        return "override this with read for ebook";
    }

    public String reserve(){
        return "this ebook has been reserved";
    }

    public String play(){
        return "override this with read for ebook";
    }

    public String borrow(){
        return "ebook sent to email";
    }

    public String read(){
        return "preparing book for reading...";
    }
}