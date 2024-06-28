package DoublyLinkedList;

public class ConvertArrauToDLL {
    Node constructDLL(int arr[]) {
        Node Head = new Node(arr[0]);
        Node previous = Head;
        for(int i = 1 ; i < arr.length ; i++){
            Node p = new Node(arr[i]);
            p.prev = previous;
            previous.next = p;
            previous = p;
        }
        return Head;
    }
}
