package com.sda.javabyd3.lusi.exg009.ex03;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileWriterReader fwr = new FileWriterReaderImpl();
        Contacts contacts = new Contacts(fwr);
        contacts.loadContats();
        Menu menu = new Menu();
        menu.displayMenu();
        SearchByEnum searchByEnum = menu.getAnswer();
        String searchString = menu.searchText();
        List<Person> filteredContacts = contacts.searchBy(searchByEnum, searchString);

        System.out.println(filteredContacts.toString());
    }
}
