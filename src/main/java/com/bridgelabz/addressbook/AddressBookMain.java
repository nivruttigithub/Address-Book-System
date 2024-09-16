package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Add New Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addressBook.addContactFromConsole();
                    break;
                case 2:
                    addressBook.displayAllContacts();
                    break;
                case 3: // Edit contact functionality
                    System.out.println("Enter First Name of the contact to edit: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter Last Name of the contact to edit: ");
                    String lastName = scanner.nextLine();
                    addressBook.editContact(firstName, lastName);  // Calls the edit method
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting Address Book...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
