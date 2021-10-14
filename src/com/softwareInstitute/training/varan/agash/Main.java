package com.softwareInstitute.training.varan.agash;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<LibraryItems> library = new ArrayList<LibraryItems>();

        Books book1 = new Books("Wolves", "conn");

        library.add(book1);

        System.out.println(library.get(0));



        System.out.println(book1.readBlurb());
        System.out.println(book1.use());
        System.out.println(book1.reserve());
        System.out.println(book1.flickThrough());
        System.out.println(book1.borrow());
        System.out.println(book1.read());
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
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
