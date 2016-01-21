
package linkedlist;

import java.util.LinkedList;

public class LinkedListUS<D> {
    
    // Properties
    Node<D> head;
    int count;
    
    // Constructors
//    public LinkedList() {
//        head = null;
//        count = 0;
//    }
//    
    public LinkedListUS(Node<D> newHead) {
        head = newHead;
        count = 1;
    }
    
    // Methods
    
    //add
    public void add(D newData) {
        Node<D> temp = new Node(newData);
        Node<D> current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }
    
    //get
    public D get(int index) {
    //    if (index <= 0) {
      //      return -1;
       // }
        Node<D> current = head;
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
        Node<D> current = head;
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
