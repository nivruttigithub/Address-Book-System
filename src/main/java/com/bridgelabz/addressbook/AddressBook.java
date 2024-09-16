package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<ContactCreation> contacts;

    // Constructor initializes the contact list
    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    // Method to add a contact
    public void addContact(ContactCreation contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    // Method to add contact details from console input
    public void addContactFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter Address: ");
        String address = scanner.nextLine();
        System.out.println("Enter City: ");
        String city = scanner.nextLine();
        System.out.println("Enter State: ");
        String state = scanner.nextLine();
        System.out.println("Enter Zip: ");
        String zip = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();

        // Creating new ContactPerson object and adding to address book
        ContactCreation contact = new ContactCreation(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addContact(contact);
    }

    // Method to display all contacts
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in address book.");
        } else {
            for (ContactCreation contact : contacts) {
                contact.displayContact();
            }
        }
    }
}
