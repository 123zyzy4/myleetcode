package day11retry;

import org.junit.jupiter.api.Test;

public class Solution1 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head==null){
            return null;
        }
        if(head.val==val){
            return head.next;
        }
        ListNode cur=head;
        while(cur.next!=null){
            if(cur.next.val==val){
                cur.next=cur.next.next;
                break;
            }
            cur=cur.next;
        }
        return head;

    }
    @Test
    public void test(){
        ListNode node=null;
        if(node.val==0){
            System.out.println("yes");
        }

    }
}
