// Eduardo Aguilera
// 3/3/26
// CS145 Assignment 8
// Phonebook, a program that manages a phonebook
// Class that house methods that manage the phonebook
import java.util.Scanner;
public class Phonebook {
    public static Scanner input = new Scanner(System.in);  // create a Scanner object
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
                    break;
                case 2:
                    System.out.println(2);
                    // add with index
                    break;
                case 3:
                    System.out.println(3);
                    // display
                    break;
                case 4:
                    System.out.println(4);
                    // modify
                    break;
                case 5:
                    System.out.println(5);
                    // delete
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
