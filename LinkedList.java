// Eduardo Aguilera
// 3/3/26
// CS145 Assignment 8
// Phonebook, a program that manages a phonebook
// LinkedList that represents a contact
public class LinkedList {
    private String name; // name of contact
    private String number; // number of contact
    private String address; // address of contact

    public LinkedList() {
        LinkedList next; // reference to next contact
    }
    public LinkedList(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
        LinkedList next;  // reference to next contact
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
    
}
