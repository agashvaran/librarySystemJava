package com.softwareInstitute.training.varan.agash;

public class EmptyDesk extends LibraryItems {
    //Attributes
    private String deskNumber;

    //Constructors
    public EmptyDesk(String deskNumber, String libraryItemType){
        super(libraryItemType);
        this.deskNumber = deskNumber;
    }

    public EmptyDesk(String deskNumber){
        super("EmptyDesk");
        this.deskNumber = deskNumber;
    }

    //Methods
    public String use(){
        return "setting up my stuff on the emptydesk...";
    }

    public String reserve(){
        return "emptydesk reserved";
    }

    public String usePersonalDevice(){
        return "using my personal laptop...";
    }
}