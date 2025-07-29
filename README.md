# Electriccitybill.java
import java.util.*;

public class SimpleContact {
    public static void main(String[] args) {
        ArrayList<String> contacts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Add contacts
        contacts.add("Ravi");
        contacts.add("Priya");
        contacts.add("Arun");

        // Display all contacts
        System.out.println("All Contacts: " + contacts);

        // Search a contact
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        if (contacts.contains(name)) {
            System.out.println(name + " found in contacts.");
        } else {
            System.out.println(name + " not found.");
        }

        // Delete a contact
        System.out.print("Enter name to delete: ");
        String del = sc.nextLine();
        if (contacts.remove(del)) {
            System.out.println(del + " deleted successfully.");
        } else {
            System.out.println(del + " not found.");
        }

        // Show updated contact list
        System.out.println("Updated Contacts: " + contacts);
    }
}
