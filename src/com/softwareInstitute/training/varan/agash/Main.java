package com.softwareInstitute.training.varan.agash;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<LibraryItems> libraryStock = new ArrayList<>();

        Books book1 = new Books("Wolves Of The Plains", "Conn Iggulden");
        Magazines mag1 = new Magazines("Wired October 2021");

        AudioBooks audio1 = new AudioBooks("Can't hurt me", "David Goggins");
        Ebooks ebook1 = new Ebooks("The 80/20 principle", "R Koch");
        DVDs dvd1 = new DVDs("No Time To Die");

        EmptyDesk emptyDesk1 = new EmptyDesk("1");
        ComputerDesk computerDesk1 = new ComputerDesk("23");

        libraryStock.add(book1);
        libraryStock.add(mag1);
        libraryStock.add(audio1);
        libraryStock.add(ebook1);
        libraryStock.add(dvd1);
        libraryStock.add(emptyDesk1);
        libraryStock.add(computerDesk1);

        Library myLibrary = new Library("LE11 3UG", libraryStock);

        System.out.println(myLibrary.getPostCode());
        for( int i = 0; i < libraryStock.size(); i++){
            System.out.println(myLibrary.getItems().get(i).getLibraryItemName());
        }


//        System.out.println(book1.readBlurb());
//        System.out.println(book1.use());
//        System.out.println(book1.reserve());
//        System.out.println(book1.flickThrough());
//        System.out.println(book1.borrow());
//        System.out.println(book1.read());
//        System.out.println(book1.getTitle());
//        System.out.println(book1.getAuthor());












    }
}
