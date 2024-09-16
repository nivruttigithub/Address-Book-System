package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBookSystem system = new AddressBookSystem();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add New Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Display All Address Books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the name for new Address book: ");
                    String newBookName = scanner.nextLine();
                    system.addNewAddressBook(newBookName);
                    break;
                case 2:
                    system.displayAddressBookNames();
                    System.out.println("Enter the name of the Address book to Select : ");
                    String selectedBookName = scanner.nextLine();
                    AddressBook selectedBook = system.selectAddressBook(selectedBookName);
                    if (selectedBook != null) {
                        manageAddressBook(selectedBook);
                    } else {
                        System.out.println("Address Book not found.");
                    }
                    break;
                case 3:
                    system.displayAddressBookNames();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exit from Address Book System...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
    private static void manageAddressBook(AddressBook addressBook) {
        Scanner scanner = new Scanner(System.in);
        boolean managing = true;

        while (managing) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Back to Main Menu");
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
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    addressBook.editContact(firstName, lastName);
                    break;
                case 4:
                    System.out.print("Enter First Name of the contact to delete: ");
                    String firstNameToDelete = scanner.nextLine();
                    System.out.print("Enter Last Name of the contact to delete: ");
                    String lastNameToDelete = scanner.nextLine();
                    addressBook.deleteContact(firstNameToDelete, lastNameToDelete);
                    break;
                case 5:
                    managing = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
