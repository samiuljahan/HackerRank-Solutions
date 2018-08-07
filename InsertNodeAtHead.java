public class InsertNodeAtHead {
    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(llist == null)
            llist = newNode;
        else{
            newNode.next = llist;
            llist = newNode;
        }
        return llist;
    }
}