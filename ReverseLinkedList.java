package AssignmentNov17;

public class ReverseLinkedList {
	
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = null, p1 = head, p2 = head.next;
        while (p2 != null) {
            p1.next = temp;
            temp = p1;
            p1 = p2;
            p2 = p2.next;
        }
        p1.next = temp;
        return p1;
    }
}
