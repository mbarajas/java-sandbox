import java.util.*;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedList {

    public static Node reverseList(Node head) {

        Node current = head, previous = null, next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;

    }

    public static List<Node> merge(Node head1, Node head2) {
        Node<Integer> temp1 = head1;
        Node<Integer> temp2 = head2;

        while (temp1 != null && temp2 != null) {
            Node<Integer> ptr1 = temp1.next;
            Node<Integer> ptr2 = temp2.next;

            temp2.next = temp1.next;
            temp1.next = temp2;

            temp1 = ptr1;
            temp2 = ptr2;
        }

        return Arrays.asList(head1, temp2);
    }

    public static Node mergeSortedLists(Node head1, Node head2){
        ArrayList<Integer> arr = new ArrayList<>();

        // Pushing the values of the first linked list
        while (head1 != null) {
            arr.add(head1.data);
            head1 = head1.next;
        }

        // Pushing the values of the second linked list
        while (head2 != null) {
            arr.add(head2.data);
            head2 = head2.next;
        }

        // Sorting the list
        Collections.sort(arr);

        // Creating a new list with sorted values
        Node dummy = new Node(-1);
        Node curr = dummy;

        for (int i = 0; i < arr.size(); i++) {
            curr.next = new Node(arr.get(i));
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void findLoop(Node head) {
        
        // hash set to hash addresses of
        // the linked list nodes
        HashSet<Node> st = new HashSet<>();

        // pointer to prev node
        Node prev = null;
        while (head != null) {

            // if node not present in the map,
            // insert it in the map
            if (!st.contains(head)) {
                st.add(head);
                prev = head;
                head = head.next;
            }

            // if present, it is a cycle, make
            // last node's next pointer NULL
            else {
                prev.next = null;
                break;
            }
        }
    }

    public static Node findYIntersection(Node head) {
        return null;
    }

    public static Node swapNodes(Node head) {
        return null;
    }

    public static Node lruCache(Node head) {
        return null;
    }

    public static Node doublyLinkedList(Node head) {
        return null;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.println(" " + node.data);
            node = node.next;
        }

    }

    public static void main(String[] args) {
        System.out.println("Linked List Test");

        Node<Integer> firstList = new Node<Integer>(1);
        firstList.next = new Node(2);
        firstList.next.next = new Node(3);
        printList(firstList);

        Node<Integer> reversedList = reverseList(firstList);
        printList(reversedList);
    }
}
