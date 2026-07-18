import java.util.*;

public class LinkedList2 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    //* Floyd's Cycle Detection Algorithm:-
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // move 1 step
            fast = fast.next.next;      // move 2 steps

            if (slow == fast) {
                return true;            // cycle found
            }
        }

        return false;                   // no cycle
    }

    //*Removing Cycle in LL:-
    
    public static void removeCycle() {
    // Detect Cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            cycle = true;
            break;
        }
    }

    if (cycle == false) {
        return;
    }

    // Find meeting point
    slow = head;
    Node prev = null;

    while (slow != fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }

    // Remove cycle
    prev.next = null;
}

    public static void main(String[] args) {

        // Creating nodes
        head = new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;


        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

        
    }
}