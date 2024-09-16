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
//    // Method to add multiple contacts
//    public void addMultipleContactsFromConsole() {
//        Scanner scanner = new Scanner(System.in);
//        boolean addingMore = true;
//
//        while (addingMore) {
//            addContactFromConsole(); // Add a single contact
//            System.out.println("Do you want to add another contact? (yes/no): ");
//            String response = scanner.nextLine();
//
//            if (response.equalsIgnoreCase("no")) {
//                addingMore = false; // Exit loop if the user says 'no'
//            }
//        }
//    }
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
    // Method to search contact by name
    public ContactCreation searchContact(String firstName, String lastName) {
        for (ContactCreation contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                return contact;
            }
        }
        return null; // Contact not found
    }

    // Method to edit an existing contact
    public void editContact(String firstName, String lastName) {
        ContactCreation contact = searchContact(firstName, lastName);
        if (contact == null) {
            System.out.println("Contact not found.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Edit Address: ");
        String address = scanner.nextLine();
        System.out.println("Edit City: ");
        String city = scanner.nextLine();
        System.out.println("Edit State: ");
        String state = scanner.nextLine();
        System.out.println("Edit Zip: ");
        String zip = scanner.nextLine();
        System.out.println("Edit Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Edit Email: ");
        String email = scanner.nextLine();

        // Updating the contact details
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);

        System.out.println("Contact details updated successfully.");
    }

    public void deleteContact(String firstName, String lastName) {
        ContactCreation contact = searchContact(firstName, lastName);
        if (contact == null) {
            System.out.println("Contact not found.");
            return;
        }
        contacts.remove(contact);
        System.out.println("Contact deleted successfully.");
    }
}
