package day2retry;

public class Solution2 {
    public ListNode reverseList(ListNode head) {
       if(head==null){
           return head;
       }
        ListNode p,q,r;
        p=head;
        q=head.next;
        p.next=null;
        while(q!=null){
            r=q.next;
            q.next=p;
            p=q;
            q=r;
        }
        return p;
    }
}
