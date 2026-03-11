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
        list.add("Luis", "d", "f");
        list.displayAll();
        list.delete(4);
        list.displayAll();
        //list = Phonebook.swapPrompt(list);
    }
}
