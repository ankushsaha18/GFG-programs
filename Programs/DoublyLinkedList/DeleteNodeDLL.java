package DoublyLinkedList;

public class DeleteNodeDLL {
    Node deleteNode(Node head,int x) {
        Node temp = head;
        if(x == 1){
            head = head.next;
            head.prev = null;
            return head;
        }
        for(int i = 1 ; i < x ; i++){
            temp = temp.next;
        }
        if(temp.prev != null){
            temp.prev.next = temp.next;
        }
        if(temp.next != null){
            temp.next.prev = temp.prev;
        }
        return head;
    }
}
