// Eduardo Aguilera
// 3/3/26
// CS145 Assignment 8
// Phonebook, a program that manages a phonebook
// Class that house methods that manage the phonebook
import java.util.Scanner;
public class Phonebook {
    public static Scanner input = new Scanner(System.in);  // create a Scanner object
    public static void userMenu() {
        ListNode phonebook = new ListNode();
        boolean menu = true;
        while (menu == true) { // keep menu looping
            System.out.println("What would you like to do?");
            System.out.println("1: Add to phonebook, 2: Edit contact, 3: Search for contact, 4: Swap 2 contacts positions");
            System.out.println("5: Delete contact, 6: Display all contacts, 7: Display all contacts in reverse, 8: Quit Menu");
            try {
                int answer = input.nextInt();
                input.nextLine();
                switch (answer) {
                case 1: // add
                    phonebook = addPrompt(phonebook);
                    break;
                case 2: // edit
                    phonebook = editPrompt(phonebook);
                    break;
                case 3: // search
                    searchPrompt(phonebook);
                    break;
                case 4: // swap
                    phonebook = swapPrompt(phonebook);
                    break;
                case 5: // delete
                    phonebook = deletePrompt(phonebook);
                    break;
                case 6: // display all
                    phonebook.displayAll();
                    break;
                case 7: // display all in reverse
                    phonebook.displayAllRev();
                    break;
                case 8: // quit
                    menu = false;
                    break;
                default:
                    System.out.println("Not an option, try again");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input, digit answers only");
                input.nextLine(); // clears input
            }
        }
    }
    public static ListNode addPrompt(ListNode phonebook) { // prompt for adding contact
        System.out.print("What is the name of the new contact?: ");
        String name = input.nextLine();
        System.out.print("What is the phone number of the new contact?: ");
        String number = input.nextLine();
        System.out.print("What is the address of the new contact?: ");
        String address = input.nextLine();
        phonebook.add(name, number, address);
        return phonebook;
    }
    public static ListNode editPrompt(ListNode phonebook) { // prompt for editting contact
        String name;
        String number;
        String address;
        System.out.println("Search for contact you'd like to edit");
        int index = searchPrompt(phonebook);
        if (index <= 0) {
            System.out.println("No match found error");
        } else {
            boolean menu = true;
            while (menu == true) { // keep menu looping
                System.out.println("What would you like to edit?");
                System.out.println("1: Name, 2: Number, 3: Address, 4: Quit Menu");
                try {
                    int answer = input.nextInt();
                    input.nextLine(); // clears input
                    switch (answer) {
                    case 1: // name
                        System.out.println("What would you like to edit the name to be?");
                        name = input.nextLine();
                        phonebook.getContact(index).setName(name);
                        break;
                    case 2: // number
                        System.out.println("What would you like to edit the number to be?");
                        number = input.nextLine();
                        phonebook.getContact(index).setNumber(number);
                        break;
                    case 3: // address
                        System.out.println("What would you like to edit the address to be?");
                        address = input.nextLine();
                        phonebook.getContact(index).setAddress(address);
                        break;
                    case 4:
                        menu = false;
                        break;
                    default:
                        System.out.println("Not an option, try again");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input, digit answers only");
                    input.nextLine(); // clears input
                }
            }
        }
        return phonebook;
    }
    public static int searchPrompt(ListNode phonebook) { // prompt for searching for a contact
        System.out.println("What attribute would you like to search for? (Must be an exact match)");
        String search = input.nextLine();
        int index = phonebook.search(search);
        return index;
    }
    public static ListNode swapPrompt(ListNode phonebook) { // prompt for swapping for a contact
        System.out.println("Search for contact 1 you want to swap");
        int index1 = searchPrompt(phonebook);
        if (index1 <= 0) {
            System.out.println("No match found error");
            return phonebook;
        }
        System.out.println("Search for contact 2 you want to swap");
        int index2 = searchPrompt(phonebook);
        if (index1 <= 0) {
            System.out.println("No match found error");
            return phonebook;
        }
        phonebook.swap(index1, index2);
        phonebook.displayAll();
        return phonebook;
    }
    public static ListNode deletePrompt(ListNode phonebook) { // prompt for deleting a contact
        System.out.println("Search for contact you want to delete");
        int index = searchPrompt(phonebook);
        if (index <= 0) {
            System.out.println("No match found error");
            return phonebook;
        }
        phonebook.delete(index);
        return phonebook;
    }
}
