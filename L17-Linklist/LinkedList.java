import java.util.*;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //*Add First:-
    public void addFirst(int data) {
        Node newNode=new Node(data);
        size++;

        if(head == null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;

        head=newNode;
    }
    //*Add last:-
    public void addLast(int data) {
        Node newNode=new Node(data);
        size++;
        if(head == null) {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    //*Print LL:-

    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp != null) {
            System.out.print(temp.data+ " -->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //*Add in the middle:-

    public void addMid(int idx,int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;

        while(i < idx-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    //*Remove First in LL:-
    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    //*Remove last in Linked List:-
    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0; i < size-2;i++) {
            prev=prev.next;
        }

        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }

    //*Iterative Search:-

    public int itrSearch(int key) {
        Node temp=head;
        int i=0;

        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    //*Recursive Search:-
    public int helper(Node head,int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx=helper(head.next,key);

        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head,key);
    }

    //*Reverse a Linked List:-
    public void reverse() {
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr != null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //*Delete and remove Nth Node from end:-

    public void deleteNthFromEnd(int n) {
        //Calculate size
        int sz=0;
        Node temp=head; 
        while(temp != null) {
            temp=temp.next;
            sz++;
        }

        if(n == sz) {
            head=head.next;
            return;
        }

        //sz-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i < iToFind) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //*Check Palindrome in Linked List:-
    public boolean checkPalindrome() {
    if(head == null || head.next == null) {
        return true;
    }

    // Step 1: Find middle
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Step 2: Reverse second half
    Node prev = null;
    Node curr = slow;
    Node next;

    while(curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    // Step 3: Compare both halves
    Node left = head;
    Node right = prev;

    while(right != null) {
        if(left.data != right.data) {
            return false;
        }
        left = left.next;
        right = right.next;
    }

    return true;
}



    

    public static void main(String args[]) {
        LinkedList ll =new LinkedList();
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.addMid(2,5);
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.itrSearch(5));
        // System.out.println(ll.itrSearch(10));

        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);

        // ll.print();

        // ll.reverse();
        // ll.print();

        // ll.deleteNthFromEnd(3);
        // ll.print();

        // ll.addFirst(2);
        ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        ll.print();
        // System.out.println(ll.checkPalindrome());

        ll.removeFirst();
        ll.print();


        
    }
}