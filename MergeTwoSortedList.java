package AssignmentNov17;

	//Input: l1 = [1,2,4], l2 = [1,3,4]
	//Output: [1,1,2,3,4,4]

public class MergeTwoSortedList {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode head = node;
        while (l1!=null && l2!=null){
            if(l1.val<=l2.val){
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        
        if(l1 != null){
            node.next = l1;
        }
        if(l2 != null){
            node.next = l2;
        }
        return head.next;
    }
}
