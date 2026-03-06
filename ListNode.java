// Eduardo Aguilera
// 3/3/26
// CS145 Assignment 8
// Phonebook, a program that manages a phonebook
// ListNode that represents a contact
public class ListNode {
    private String name; // name of contact
    private String number; // number of contact
    private String address; // address of contact
    private ListNode next; // reference to next contact

    public ListNode() {
    }
    public ListNode(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }
    public ListNode(String name, String number, String address, ListNode next) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.next = next; // parameter next = next of this node
    }
    public String getName() { // returns name
        return this.name;
    }
    public void setName(String name) { // sets name to given parameter
        this.name = name;
    }
    public String getNumber() { // returns number
        return this.number;
    }
    public void setNumber(String number) { // sets number to given number
        this.number = number;
    }
    public String getAddress() { // returns address
        return this.address;
    }
    public void setAddress(String address) { // sets address to given parameter
        this.address = address;
    }
    public void count() { // counts amount of contacts in the list
        ListNode current = this;
        while (current != null) {
            System.out.println(current.name);
            current = current.next;
        }

    }
}
