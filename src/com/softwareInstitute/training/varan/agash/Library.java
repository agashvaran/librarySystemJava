package com.softwareInstitute.training.varan.agash;

import java.util.ArrayList;

public class Library {

    //Attributes
    private ArrayList<LibraryItems> libraryStock;
    private String postCode;

    //Constructor

    public Library(String postCode ,ArrayList<LibraryItems> libraryStock){
        this.postCode = postCode;
        this.libraryStock = new ArrayList<>(libraryStock);
    }

    //Methods
    public String getPostCode(){
        return postCode;
    }

    public ArrayList<LibraryItems> getItems(){
        return libraryStock;
    }

}



