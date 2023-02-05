package day2;

public class Solution2 {
    public ListNode reverseList(ListNode head) {
        ListNode p,q,r;
        if(head==null||head.next==null){
            return head;
        }
        q=head.next;
        p=head;
        head.next=null;
        while(q!=null){
            r=q.next;
            q.next=p;
            p=q;
            q=r;
        }
        return p;
    }
}
