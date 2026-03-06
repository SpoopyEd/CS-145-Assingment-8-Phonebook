// Eduardo Aguilera
// 3/3/26
// CS145 Assignment 8
// Phonebook, a program that manages a phonebook
import java.util.Scanner;

public class Test {
    public static Scanner input = new Scanner(System.in);  // create a Scanner object
    public static void main(String[] args) {
        ListNode list = new ListNode();

        list.add("Eduardo", "360", "1234");
        list.add("Aguilera", "360", "1234");
        list.count();
    }
}
