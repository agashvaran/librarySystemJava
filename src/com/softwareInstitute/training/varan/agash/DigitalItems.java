package com.softwareInstitute.training.varan.agash;

public abstract class DigitalItems extends LibraryItems implements Borrow {
    //Attributes
//    private String digitalItemType;


    //Constructors
    public DigitalItems(String libraryItemType){
        super(libraryItemType);
    }

    //Methods
    public abstract String play();
}
