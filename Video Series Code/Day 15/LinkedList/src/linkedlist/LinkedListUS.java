
package linkedlist;

import java.util.LinkedList;

public class LinkedListUS {
    
    // Properties
    Node head;
    int count;
    
    // Constructors
//    public LinkedListUS() {
//        head = null;
//        count = 0;
//    }
//    
    
    
    // The bug is that Node newHead should be int newData and we
    // should create a new Node that is the head....
    //   public LinkedListUS(Node newHead) {
    //    head = newHead;
    //    count = 1;
    //  }
    
    public LinkedListUS(int data) {
        head = new Node(data);
        count = 1;
    }
    
    // Methods
    
    //add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }
    
    //get
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }
    
    //size
    public int size() {
        return count;
    }
    
    //isEmpty
    public boolean isEmpty() {
        return head == null;
    }
    
    //remove
    public void remove() {
        // remove from the back of the list
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Alice");
        System.out.println(linkedlist);
        linkedlist.add("Alicey");
        System.out.println(linkedlist);
    }
    
}
