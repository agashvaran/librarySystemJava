package com.softwareInstitute.training.varan.agash;

public class ComputerDesk extends LibraryItems {
    //Attributes
    private String computerDeskNumber;

    //Constructors
    public ComputerDesk(String deskNumber, String libraryItemName){
        super(libraryItemName);
        this.computerDeskNumber = computerDeskNumber;
    }

    public ComputerDesk(String deskNumber){
        super("EmptyDesk");
        this.computerDeskNumber = computerDeskNumber;
    }

    //Methods
    public String use(){
        return "sitting down in front of the computer desk";
    }

    public String reserve(){
        return "computer desk has been reserved.";
    }

    public String logIn(){
        return "logging in to library computer";
    }

    public String logOut(){
        return "logging out of library computer";
    }

    public String getLibraryItemName() {
        return "EmptyDesk" + computerDeskNumber;
    }
}
