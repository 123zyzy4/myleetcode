package day12;

public class Solution1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //头节点随便给一个值会好些很多
        ListNode cur1=l1,cur2=l2,head=new ListNode(0);
        ListNode cur3=head;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<=cur2.val){
                cur3.next=cur1;
                cur3=cur1;
                cur1=cur1.next;
            }else{
                cur3.next=cur2;
                cur3=cur2;
                cur2=cur2.next;
            }
        }
        if(cur1!=null){
            cur3.next=cur1;
        }
        if(cur2!=null){
            cur3.next=cur2;
        }

        return head.next;
    }
}
