package day11retry;

public class Solution2 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cur1=head,cur2=head;
        for (int i = 0; i < k; i++) {
            cur2=cur2.next;
        }
        while(cur2!=null){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }
}
