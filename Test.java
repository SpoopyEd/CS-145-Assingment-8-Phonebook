// Eduardo Aguilera
// 3/3/26
// CS145 Assignment 8
// Phonebook, a program that manages a phonebook
public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList("Eduardo", "360", "6284");
        System.out.println("Name: " + list.getName());
        System.out.println("Number: " + list.getNumber());
        System.out.println("Address: " + list.getAddress());
    }
}
