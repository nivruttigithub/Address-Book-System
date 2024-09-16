package com.bridgelabz.addressbook;

import java.util.HashMap;
import java.util.Map;

public class AddressBookSystem {
    private Map<String, AddressBook> addressBooks;

    // Constructor initializes the map of address books
    public AddressBookSystem() {
        this.addressBooks = new HashMap<>();
    }

    // Method to add a new address book
    public void addNewAddressBook(String bookName) {
        if (addressBooks.containsKey(bookName)) {
            System.out.println("Address Book with this name already exists.");
        } else {
            addressBooks.put(bookName, new AddressBook());
            System.out.println("Address Book \"" + bookName + "\" created successfully.");
        }
    }

    // Method to select an address book by name
    public AddressBook selectAddressBook(String bookName) {
        return addressBooks.get(bookName);
    }

    // Method to display all address book names
    public void displayAddressBookNames() {
        if (addressBooks.isEmpty()) {
            System.out.println("No address books available.");
        } else {
            System.out.println("Available Address Books:");
            for (String bookName : addressBooks.keySet()) {
                System.out.println("- " + bookName);
            }
        }
    }
}
