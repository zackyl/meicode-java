
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static ArrayList<Contact> contacts;
    private static Scanner scanner;
    private static int id = 0;

    public static void main(String[] args) {
        contacts = new ArrayList<>();
        System.out.println("Welcome user!");
        scanner = new Scanner(System.in);
        showInitialOptions();
    }

    private static void showInitialOptions() {
        System.out.println("Please select one:\n\t1. Manage contacts" +
                "\n\t2. Message\n\t3. Quit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> manageContacts();
            case 2 -> manageMessages();
            default -> {
            }
        }
    }

    private static void manageMessages() {
        System.out.println("""
                Please select one:
                \t1. See the list of all messages
                \t2. Send a new message
                \t3. Go back to the previous menu""");
        switch (scanner.nextInt()) {
            case 1 -> showMessages();
            case 2 -> sendMessage();
            default -> showInitialOptions();
        }
    }

    private static void sendMessage() {
        System.out.println("Please enter a contact to send a message to");
        String name = scanner.next();
        Optional<Contact> result = contacts.stream().filter(contact -> contact.getName().equals(name)).findFirst();
        if (result.isEmpty()) {
            System.out.println("Person does not exist in contacts");
            showInitialOptions();
            return;
        }
        Contact recipient = result.get();
        System.out.println("Enter a message");
        String message = scanner.next();
        while (message.isEmpty()) {
            System.out.println("Please enter a nonempty message");
            message = scanner.next();
        }
        recipient.getMessages().add(new Message(message, recipient.getName(), id++)); //new Random().nextInt()));
//        forloop for contacts c
//        Contact current = c;
//        current.setMessages(newMessage);
//        contacts.remove(c);
//        contacts.add(current);
        System.out.println("Message sent!");
        showInitialOptions();
    }

    // he creates new new arraylist, uses addall for each contact
    // ArrayList<>;
    private static void showMessages() {
        boolean hasMessages = false;
        for (Contact contact : contacts) {
            System.out.println("Messages for contact " + contact.getName() + ":");
            for (Message message : contact.getMessages()) {
                if (!hasMessages) {
                    hasMessages = true;
                }
//                System.out.println(message.getText());
                message.getDetails();
                System.out.println("**************");
            }
        }
        if (!hasMessages) {
            System.out.println("You have no messages");
        }
        showInitialOptions();
    }

    private static void manageContacts() {
        System.out.println("Please select one:\n\t1. Show all contacts" +
                "\n\t2. Add a new contact\n\t3. Search for a contact\n\t4. Delete a contact" +
                "\n\t5. Go back");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> showAllContacts();
            case 2 -> addNewContact();
            case 3 -> searchForContact();
            case 4 -> deleteContact();
            default -> showInitialOptions();
        }
    }

    private static void deleteContact() {
        System.out.println("Deleting a contact...\nPlease enter a contact's name");
        String name = scanner.next();
        if (name.isEmpty()) {
            System.out.println("please enter a nonempty name");
            deleteContact();
            return;
        }
        if (contacts.removeIf(contact -> contact.getName().equals(name))) {
            System.out.println("Contact removed!");
        } else {
            System.out.println("Contact not found");
        }
        showInitialOptions();
    }

    private static void searchForContact() {
        System.out.println("Searching for a contact...\nPlease enter a contact's name");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("Please enter a nonempty name");
            searchForContact();
            return;
        }
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("Contact found!");
                contact.getDetails();
                showInitialOptions();
                return;
            }
        }
        System.out.println("Contact was not found");
        showInitialOptions();
    }

    // I originally felt like this should go into a person class but oh well
    private static void addNewContact() {
        System.out.println("Adding a new contact...\nPlease enter a contact's name");
        String name = scanner.next();
        System.out.println("Please enter the contact's number");
        String number = scanner.next();
        System.out.println("Please enter the contact's email");
        String email = scanner.next();
        if (name.equals("") || number.equals("") || email.isEmpty()) {
            System.out.println("Please enter all of the information");
            addNewContact();
        } else {
            if (contacts.stream().anyMatch(contact -> contact.getName().equals(name))) {
                System.out.println("We already have a contact named " + name + " on this device");
                addNewContact();
            } else {
                Contact contact = new Contact(name, number, email);
                contacts.add(contact);
                System.out.println("Name added successfully");
                showInitialOptions();
            }
        }
    }

//    private static void addNewContact() {
//        String name;
//        String number;
//        String email;
//        do {
//            System.out.println("Adding a new contact...\nPlease enter a contact's name");
//            name = scanner.next();
//            System.out.println("Please enter the contact's number");
//            number = scanner.next();
//            System.out.println("Please enter the contact's email");
//            email = scanner.next();
//        } while (name.equals("") || number.equals("") || email.isEmpty());
//    }

    private static void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("You do not have any contacts");
        } else {
            for (Contact c : contacts) {
                c.getDetails();
                System.out.println("******************");
            }
        }
        showInitialOptions();
    }
}