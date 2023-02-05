package day11;

public class Solution2 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast=head,slow=head;
        int count=0;
        while (fast != null && count < k) {
            fast = fast.next;
            count++;
        }
        //k大于链表长度的情况不用考虑
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
