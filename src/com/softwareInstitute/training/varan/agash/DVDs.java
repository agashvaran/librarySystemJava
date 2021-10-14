package com.softwareInstitute.training.varan.agash;

public class DVDs extends DigitalItems {
    //Attributes
    private String title;


    //Constructors
    public DVDs(String Title, String libraryType){
        super(libraryType);
        this.title = title;
    }

    public DVDs(String Title){
        super("DVDs");
        this.title = title;
    }

    //Methods
    public String use(){
        return "override with play for DVD";
    }

    public String reserve(){
        return "this DVD has been reserved";
    }

    public String play(){
        return "playing DVD...";
    }

    public String borrow(){
        return "DVD is loaned to you for a week.";
    }
}