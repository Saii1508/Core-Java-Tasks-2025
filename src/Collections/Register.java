package Collections;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        ContactManager c1 = new ContactManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contact");
            System.out.println("3. Display Only Names");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
//something
            switch (choice) {
                case 1:
                    c1.addContact();
                    break;
                case 2:
                    c1.displayContacts();
                    break;
                case 3:
                    c1.displayOnlyNames();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}