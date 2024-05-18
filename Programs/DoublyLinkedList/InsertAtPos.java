package DoublyLinkedList;

public class InsertAtPos {
    void addNode(Node head_ref, int pos, int data) {
        Node temp = head_ref;
        for(int i = 0 ; i < pos ; i++){
            temp = temp.next;
        }
        Node p = new Node(data);
        p.prev = temp;
        p.next = temp.next;
        temp.next = p;
    }
}
