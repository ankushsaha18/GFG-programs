package SinglyLinkedList;

public class LengthOfLL {
    public static int getCount(Node head)
    {
        Node temp = head;
        int cnt = 0;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
}
