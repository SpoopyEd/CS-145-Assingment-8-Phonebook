// Eduardo Aguilera
// 3/3/26
// CS145 Assignment 8
// Phonebook, a program that manages a phonebook
// ListNode that represents a contact
public class ListNode {
    private String name; // name of contact
    private String number; // number of contact
    private String address; // address of contact
    private ListNode front; // reference to front or head
    private ListNode next; // reference to next contact
    private ListNode prev; // reference to previous contact

    public ListNode() {
    }
    public ListNode(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    // methods that will only be used by the "list" or "head"

    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }
    public void add(String name, String number, String address) {
        if (isEmpty() == true) {
            // adding to an empty list
            front = new ListNode(name, number, address);
        } else {
            // adding to the end of an existing list
            ListNode current = front;
            while (current.next != null) { // do until there is no next assigned to the node, effectively making it the end of the list
                current = current.next;
            }
            current.next = new ListNode(name, number, address);
            current.next.prev = current; // new node references current as the previous
        }
    }
    public int search(String search) {
        int count = 0;
        if (isEmpty() == true) {
            System.out.println("Empty List Error");
            return count;
        } else {
            ListNode current = front;
            while (current != null) { // do until there is no next assigned to the node, effectively making it the end of the list
                count += 1;
                if (search.equals(current.name) || search.equals(current.number) || search.equals(current.address)) { // if search matches name, number, or address
                    System.out.println("Match found");
                    System.out.println();
                    return count;
                }
                current = current.next;
            }
            count = 0;
        }
        return count;
    }
    public void swap(int index1, int index2) {
        try {
            if (index1 == index2) return; // if they're the same, don't bother
            ListNode contact1 = getContact(index1);
            ListNode contact2 = getContact(index2);
            // updates nodes that are pointing towards given contacts
            if (contact1.prev != null) {
                contact1.prev.next = contact2;
            } else {
                front = contact2; // if contact 1 was the head
            }
            if (contact2.prev != null) {
                contact2.prev.next = contact1;
            } else {
                front = contact1; // if contact 1 was the head
            }
            if (contact1.next != null) {
                contact1.next.prev = contact2;
            }
            if (contact2.next != null) {
                contact2.next.prev = contact1;
            }
            ListNode tempNext = contact1.next;
            ListNode tempPrev = contact1.prev;
            if (tempNext == contact2) { // if they're next to eachother (contact1 before contact2)
                contact1.next = contact2.next;
                contact1.prev = contact2;
                contact2.next = contact1;
                contact2.prev = tempPrev;
            }
            else if (contact2.next == contact1) { // if they're next to eachother (contact2 before contact1)
                contact2.next = contact1.next;
                contact2.prev = contact1;
                contact1.next = contact2;
                contact1.prev = contact2.prev;
            } 
            else { // if they aren't next to eachother
                contact1.next = contact2.next;
                contact1.prev = contact2.prev;
                contact2.next = tempNext;
                contact2.prev = tempPrev;
            }
        }
        catch (Exception e) {
            System.out.println("Out of bounds error when swapping");
        }
    }
    public void delete(int index) { // deletes a contact and adjusts accordingly
        if (index <= 0) {
            System.out.println("Out of bounds error when deleting");
            return;
        }
        try {
            ListNode current = front;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            System.out.println("Deleting Contact.....");

            // updates nodes that are pointing towards given contacts
            
            if (current.prev != null) { // if current wasn't the front
                current.prev.next = current.next; // prev that is pointing at deleted now points at what deleted points at
            } else {
                front = current.next; // if deleted was the front
            }
            if (current.next != null) { // if deleted was not the end
                current.next.prev = current.prev; // next that is pointing at deleted now points at what deleted points at
            }
            current.nullify();
        } catch (Exception e) {
            System.out.println("Out of bounds error when deleting");
        }
    }
    public ListNode getContact(int index) {
        ListNode current = front;
        try {
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
        } catch (Exception e) {
            System.out.println("Out of bounds error when getting contact");
        }
        return current;
    }
    public int count() { // counts amount of contacts in the list
        int count = 0;
        ListNode current = front;
        while (current != null) { // do until there is no next assigned to the node, effectively making it the end of the list
            count += 1;
            current = current.next;
        }
        return count;
    }
    public void display(int index) { // displays information of contact at "index"
        try {
            ListNode current = front;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            System.out.printf("Contact %d%nName: %s%nNumber: %s%nAddress: %s%n%n", index, current.name, current.number, current.address);
        } catch (Exception e) {
            System.out.println("Out of bounds error when displaying");
        }
    }
    public void displayAll() { // displays all contacts
        System.out.println("Phonebook");
        System.out.println("------------");
        int count = count();
        for (int i = 1; i <= count; i++) {
            display(i);
        }
    }
    public void displayAllRev() { // displays all contacts in reverse (showcases use of prev reference)
        int count = 0;
        ListNode current = getContact(count());
        while (current != null) { // do until there is no next assigned to the node, effectively making it the end of the list
            count += 1;
            System.out.printf("Contact %d%nName: %s%nNumber: %s%nAddress: %s%n%n", count, current.name, current.number, current.address);
            current = current.prev;
        }
    }

    // methods that can be used on any ListNode/Contact

    public void edit(String name, String number, String address) { // edits a listnode
        this.name = name;
        this.number = number;
        this.address = address;
    }
    public void nullify() { // sets all variables to null
        name = null; number = null; address = null; next = null; prev = null;
    }
    public String getName() { // returns name
        System.out.println(this.name);
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
