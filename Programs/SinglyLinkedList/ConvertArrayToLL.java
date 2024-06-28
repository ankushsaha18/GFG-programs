package SinglyLinkedList;

public class ConvertArrayToLL {
    public static void main(String[] args) {
        constructLL(new int[]{1,2,3,4});
    }
    static Node constructLL(int arr[]) {
        Node Head = new Node(arr[0]);
        Node temp = Head;
        for(int i = 1 ; i < arr.length ; i++){
            Node p = new Node(arr[i]);
            temp.next = p;
            temp = p;
        }
        return Head;
    }
}
