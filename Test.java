// Eduardo Aguilera
// 3/3/26
// CS145 Assignment 8
// Phonebook, a program that manages a phonebook
import java.util.Scanner;

public class Test {
    public static Scanner input = new Scanner(System.in);  // create a Scanner object
    public static void main(String[] args) {
        ListNode list = new ListNode("Eduardo", "360", "6284");
        System.out.println("Name: " + list.getName());
        System.out.println("Number: " + list.getNumber());
        System.out.println("Address: " + list.getAddress());

        list.count();
    }
}
