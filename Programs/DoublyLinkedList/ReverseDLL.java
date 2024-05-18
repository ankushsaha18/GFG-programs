package DoublyLinkedList;

public class ReverseDLL {
    public static Node reverseDLL(Node head){
    Node current = head;
    Node previous = null;
        while (current != null){
        Node nextNode = current.next;
        current.next = previous;
        current.prev = nextNode;
        previous = current;
        current = nextNode;
    }
    head = previous;
        return head;
    }
}
