package day12;

public class Solution2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1=headA,cur2=headB;
        int length1=0,length2=0;
        while(cur1!=null){
            cur1=cur1.next;
            length1++;
        }
        while(cur2!=null){
            cur2=cur2.next;
            length2++;
        }
        if(length1>length2){
            for (int i = 0; i < length1-length2; i++) {
                headA=headA.next;
            }
        }else {
            for (int i = 0; i < length2-length1; i++) {
                headB=headB.next;
            }
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}
