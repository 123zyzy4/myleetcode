package day11;

public class Solution12 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head==null){
            return null;
        }
        if(head.val==val){
            return head.next;
        }
        ListNode pre=head,cur=pre.next;
        while(cur!=null){
            if(cur.val==val){
                if(cur.next==null){
                    pre.next=null;
                }else{
                    pre.next=cur.next;
                }
                break;
            }
            pre=cur;
            cur=cur.next;
        }
        return head;
    }
}
