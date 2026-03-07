// Eduardo Aguilera
// 3/3/26
// CS145 Assignment 8
// Phonebook, a program that manages a phonebook
import java.util.Scanner;

public class Test {
    public static Scanner input = new Scanner(System.in);  // create a Scanner object
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.add("Eduardo", "1234", "5678");
        list.add("Aguilera", "4321", "8765");
        list.add("Jeff", "9876", "6789");
        //list = Phonebook.addPrompt(list);
        list.displayAll();
        int index = Phonebook.searchPrompt(list);
        System.out.println("What would you like to edit the name to be?: ");
            String name = input.nextLine();
            list.getContact(index).setName(name);
        list.displayAll();
        //System.out.println(list.search("Luis"));

        // list.add("Eduardo", "360", "1234");
        // list.add("Aguilera", "360", "1234");
        // System.out.println(list.count());
    }
}
