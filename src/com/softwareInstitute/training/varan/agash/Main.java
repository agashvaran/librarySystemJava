package com.softwareInstitute.training.varan.agash;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<LibraryItems> library = new ArrayList<>();

        Books book1 = new Books("Wolves", "conn");
        Magazines mag1 = new Magazines("Wired1");

        AudioBooks audio1 = new AudioBooks("Can't hurt me", "David Goggins");
        Ebooks ebook1 = new Ebooks("The 80/20 principle", "R Koch");
        DVDs dvd1 = new DVDs("No Time To Die");

        EmptyDesk emptyDesk1 = new EmptyDesk("1");
        ComputerDesk computerDesk1 = new ComputerDesk("23");

        library.add(book1);
        library.add(mag1);
        library.add(audio1);
        library.add(ebook1);
        library.add(dvd1);

        System.out.println("Library contains: " + library.size() + " items");

        for(LibraryItems i : library){
            System.out.println(i.getLibraryItemName());
        }



//        System.out.println(book1.readBlurb());
//        System.out.println(book1.use());
//        System.out.println(book1.reserve());
//        System.out.println(book1.flickThrough());
//        System.out.println(book1.borrow());
//        System.out.println(book1.read());
//        System.out.println(book1.getTitle());
//        System.out.println(book1.getAuthor());
//
//        Magazines mag1 = new Magazines("Wired Uk 2021");
//
//        System.out.println(mag1.use());
//        System.out.println(mag1.reserve());
//        System.out.println(mag1.flickThrough());
//        System.out.println(mag1.borrow());
//        System.out.println(mag1.read());
//        System.out.println(mag1.getTitle());
//        System.out.println(mag1.getLibraryItemType());
//
//        EmptyDesk desk1 = new EmptyDesk("1");
//        System.out.println(desk1.getLibraryItemType());











    }
}
