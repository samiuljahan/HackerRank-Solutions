public class InsertNodeAtTail {
    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = head;
        if(current == null)
            head = newNode;
        else{
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }
}