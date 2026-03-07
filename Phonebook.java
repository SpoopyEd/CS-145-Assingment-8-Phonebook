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
    public static ListNode searchPrompt(ListNode phonebook) {
        // first check if empty
        System.out.println("What attribute would you like to search for? (Must be an exact match)");
        String search = input.nextLine();
        phonebook.display(phonebook.search(search));
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
