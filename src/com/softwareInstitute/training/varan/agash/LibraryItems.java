package com.softwareInstitute.training.varan.agash;

import java.util.ArrayList;

public abstract class LibraryItems{
    //Attributes
    private String libraryItemType;


    //Constructors

    public LibraryItems(String libraryItemType){
        this.libraryItemType = libraryItemType;
    }

    //Methods
    public abstract String use();

    public abstract String reserve();

    public String getLibraryItemType() {
        return libraryItemType;
    }

    public void setLibraryItemType(String libraryItemType) {
        this.libraryItemType = libraryItemType;
    }
}
