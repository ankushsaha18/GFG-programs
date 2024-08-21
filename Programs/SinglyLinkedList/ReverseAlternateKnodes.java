package SinglyLinkedList;

public class ReverseAlternateKnodes {
    public Node reverseKGroup(Node head, int k) {
        int length = getLength(head);
        if(head == null || k < 2){
            return head;
        }
        int left = 1;
        int right = k;
        while (right <= length){
            head = reverseBetween(head,left,right);
            left = left + k + k;
            right = right + k + k;
        }
        return head;
    }
    public Node reverseBetween(Node head, int left, int right) {
        if(left == right){
            return head;
        }
        Node current = head;
        Node prev = null;
        for(int i = 0 ; current != null && i < left - 1 ; i++){
            prev = current;
            current = current.next;
        }
        Node last = prev;
        Node end = current;
        for(int i = 0 ; current != null && i < right - left + 1 ; i++){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }
        end.next = current;
        return head;
    }
    public int getLength(Node head){
        int ans = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            ans++;
        }
        return ans;
    }
}
