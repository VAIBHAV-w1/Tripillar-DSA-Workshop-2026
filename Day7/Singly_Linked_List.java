package Day7;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Singly_Linked_List {

    Node head;

    // Add at beginning
    public void addFirst(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    // Add at given position
    public void addAtPosition(int data, int pos) {

        if (pos == 1) {
            addFirst(data);
            return;
        }

        Node curr = head;

        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Invalid Position");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = curr.next;
        curr.next = newNode;
    }

    // Display
    public void display() {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Singly_Linked_List sll = new Singly_Linked_List();

        sll.addFirst(6);
        sll.addLast(1);
        sll.addLast(2);
        sll.addAtPosition(5, 2);

        sll.display();
    }
}