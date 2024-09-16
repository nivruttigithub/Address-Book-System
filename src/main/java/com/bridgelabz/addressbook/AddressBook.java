package com.bridgelabz.addressbook;

public class AddressBook {
    public static void main(String[] args) {
        ContactCreation contact1 = new ContactCreation("Mathew", "Doe", "123 Elm Street", "Springfield", "IL", "62701", "555-1234", "methew.doe@example.com");
        ContactCreation contact2 = new ContactCreation("Capsey", "Smith", "456 Oak Street", "Metropolis", "NY", "10001", "555-5678", "capsey.smith@example.com");
        ContactCreation contact3 = new ContactCreation("Alice", "Johnson", "789 Pine Street", "Gotham", "NJ", "07001", "555-4321", "alice.johnson@example.com");

        contact1.displayContact();
        contact2.displayContact();
        contact3.displayContact();
    }
}
