import java.util.Stack;

public class StackQ {
  // TODO(1)-stack using ArrayList:-

  //   static class StackImp {
  //     static ArrayList<Integer> list = new ArrayList<>();

  //     public static boolean isEmpty() {
  //       return list.size() == 0;
  //     }

  //     // *push:-o(1)
  //     public static void push(int data) {
  //       list.add(data);
  //     }

  //     // *pop:-
  //     public static int pop() {
  //       if (isEmpty()) {
  //         return -1;
  //       }
  //       int top = list.get(list.size() - 1);
  //       list.remove(list.size() - 1);
  //       return top;
  //     }

  //     // *peek:-
  //     public static int peek() {
  //       if (isEmpty()) {
  //         return -1;
  //       }
  //       return list.get(list.size() - 1);
  //     }
  //   }

  // TODO(2)-Stack Using LinkList:-

  //   static class Node {
  //     int data;
  //     Node next;

  //     Node(int data) {
  //       this.data = data;
  //       this.next = null;
  //     }
  //   }

  //   static class StackLL {
  //     static Node head = null;

  //     public static boolean isEmpty() {
  //       return head == null;
  //     }

  //     // PUSH
  //     public static void push(int data) {
  //       Node newNode = new Node(data);
  //       newNode.next = head;
  //       head = newNode;
  //     }

  //     // POP
  //     public static int pop() {
  //       if (isEmpty()) {
  //         return -1;
  //       }

  //       int top = head.data;
  //       head = head.next;
  //       return top;
  //     }

  //     // PEEK
  //     public static int peek() {
  //       if (isEmpty()) {
  //         return -1;
  //       }
  //       return head.data;
  //     }
  //   }

  // TODO -- Push at Bottom of stack:-
  public static void pushAtBottom(Stack<Integer> s, int data) {
    if (s.isEmpty()) {
      s.push(data);
      return;
    }

    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);
  }

  // Todo : Reverse a String using a Stack:-

  public static void reverseString(String str) {
    Stack<Character> s = new Stack<>();
    int idx = 0;

    while (idx < str.length()) {
      s.push(str.charAt(idx));
      idx++;
    }

    StringBuilder result = new StringBuilder("");

    while (!s.isEmpty()) {
      char curr = s.pop();
      result.append(curr);
    }

    str = result.toString();
    System.out.println(str);
  }

  // Todo: Reverse a stack:-

  public static void reverse(Stack<Integer> s) {
    if (s.isEmpty()) {
      return;
    }

    int top = s.pop();
    reverse(s);
    pushAtBottom(s, top);
  }

  public static void main(String args[]) {
    // *ArrayList:-
    // StackImp s=new StackImp();

    // s.push(1);
    // s.push(2);
    // s.push(3);

    // while(! StackImp.isEmpty()) {
    //     System.out.println(s.peek());
    //     s.pop();
    // }

    // *LinkedList:-
    // StackLL s1 = new StackLL();

    // s1.push(1);
    // s1.push(2);
    // s1.push(3);

    // while (!StackLL.isEmpty()) {
    //     System.out.println(s1.peek());
    //     s1.pop();
    // }
    // *Push at Bottom of stack:-
    // Stack<Integer> s = new Stack<>();
    // s.push(1);
    // s.push(2);
    // s.push(3);

    // pushAtBottom(s,4);
    // while(!s.isEmpty()) {
    //     System.out.println(s.pop());
    // }
    // *Reverse a String ssing a satck:-
    // String str = "abcdef";
    // reverseString(str+" ");

    // *Revrse Stack:-

    // Stack<Integer> s = new Stack<>();
    // s.push(1);
    // s.push(2);
    // s.push(3);

    // System.out.println("Original Stack: " + s);

    // reverse(s);

    // System.out.println("Reversed Stack: " + s);

    // *Next Greater Element:-
    // Todo -- Next Greater Element:-

    int arr[] = {6, 8, 0, 1, 3};
    int nextGreater[] = new int[arr.length];

    Stack<Integer> s = new Stack<>();

    for (int i = arr.length - 1; i >= 0; i--) {

      while (!s.isEmpty() && s.peek() <= arr[i]) {
        s.pop();
      }

      if (s.isEmpty()) {
        nextGreater[i] = -1;
      } else {
        nextGreater[i] = s.peek();
      }

      s.push(arr[i]);
    }

    // System.out.println(Arrays.toString(nextGreater));
    for(int i=0; i < nextGreater.length;i++) {
      System.out.print(nextGreater[i]+" ");
    }
  }
}
