// Eduardo Aguilera
// 3/3/26
// CS145 Assignment 8
// Phonebook, a program that manages a phonebook
// Class that house methods that manage the phonebook
import java.util.Scanner;
public class Phonebook {
    public static Scanner input = new Scanner(System.in);  // create a Scanner object
    public static ListNode addPrompt(ListNode phonebook) {
        System.out.print("What is the name of the new contact?: ");
        String name = input.nextLine();
        System.out.print("What is the phone number of the new contact?: ");
        String number = input.nextLine();
        System.out.print("What is the address of the new contact?: ");
        String address = input.nextLine();
        phonebook.add(name, number, address);
        return phonebook;
    }
    public static int searchPrompt(ListNode phonebook) {
        // first check if empty
        System.out.println("What attribute would you like to search for? (Must be an exact match)");
        String search = input.nextLine();
        int index = phonebook.search(search);
        phonebook.display(index);
        return index;
    }
    public static ListNode editPrompt(ListNode phonebook) {
        String name;
        String number;
        String address;
        int index = searchPrompt(phonebook);
        boolean menu = true;
        while (menu == true) { // keep menu looping
            System.out.println("What would you like to edit?");
            System.out.println("1: Name, 2: Number, 3: Address, 5: Quit Menu");
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
                    System.out.println("What would you like to edit the index to be?");
                case 5:
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
        return phonebook;
    }
    public static ListNode deletePrompt(ListNode phonebook) {
        return phonebook;
    }
    public static void userMenu() {
        boolean menu = true;
        while (menu == true) { // keep menu looping
            System.out.println("What would you like to do?");
            try {
                int answer = input.nextInt();
                switch (answer) {
                case 1:
                    System.out.println(1);
                    // add
                    menu = continueMenu();
                    break;
                case 2:
                    System.out.println(2);
                    // add with index
                    menu = continueMenu();
                    break;
                case 3:
                    System.out.println(3);
                    // display
                    menu = continueMenu();
                    break;
                case 4:
                    System.out.println(4);
                    // modify
                    menu = continueMenu();
                    break;
                case 5:
                    System.out.println(5);
                    // delete
                    menu = continueMenu();
                    break;
                default:
                    System.out.println("Not an option, try again");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input, digit answers only");
            } finally {
                input.nextLine(); // clears input
            }
        }
    }
    public static boolean continueMenu() {
        while (true) {
            System.out.println("Would like to continue the menu? Yes (1) or No (2)");
            try {
                int answer = input.nextInt();
                switch (answer) {
                    case 1:
                        return true;
                    case 2:
                        return false;
                    default:
                        System.out.println("1 or 2 responses only");
                }
            } catch (Exception e) {
                    System.out.println("Invalid input, digit answers only");
            } finally {
                input.nextLine(); // clears input
            }
        }
    }
}
