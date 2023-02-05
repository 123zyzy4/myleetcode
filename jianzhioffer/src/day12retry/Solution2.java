package day12retry;

public class Solution2 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1=headA,cur2=headB;
        while(cur1!=cur2) {
            cur1=(cur1==null?headB:cur1.next);
            cur2=(cur2==null?headA:cur2.next);
        }
        return cur1;
    }

    public static void main(String[] args) {
        System.out.println(null==null);
    }
}
