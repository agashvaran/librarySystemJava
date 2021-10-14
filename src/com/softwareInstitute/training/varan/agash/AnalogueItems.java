package com.softwareInstitute.training.varan.agash;

public abstract class AnalogueItems extends LibraryItems implements Borrow, Read {
    //Attributes
//    private String analogueItemType;

    //Constructors

    public AnalogueItems(String libraryItemType){
        super(libraryItemType);

    }

    //Methods
    public abstract String flickThrough();

}
