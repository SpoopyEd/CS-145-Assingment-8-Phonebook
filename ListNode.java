// Eduardo Aguilera
// 3/3/26
// CS145 Assignment 8
// Phonebook, a program that manages a phonebook
// ListNode that represents a contact
public class ListNode {
    private String name; // name of contact
    private String number; // number of contact
    private String address; // address of contact
    private ListNode front; // reference to node in front of it
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

    // methods that will only be used by the "list" or "head"
    public void count() { // counts amount of contacts in the list
        ListNode current = this;
        while (current != null) {
            System.out.println(current.name);
            current = current.next;
        }

    }
    public void add(String name, String number, String address) {
        if (front == null) {
            // adding to an empty list
            front = new ListNode(name, number, address);
        } else {
            // adding to the end of an existing list
            ListNode current = front;
            while (current.next != null) { // do until there is no next assigned to the node, effectively making it the end of the list
                current = current.next;
            }
            current.next = new ListNode(name, number, address);
        }
    }

    // methods that can be used on any ListNode/Contact
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
}
