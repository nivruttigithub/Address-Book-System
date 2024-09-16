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
            System.out.println("3. Exit");
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
                case 3:
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
