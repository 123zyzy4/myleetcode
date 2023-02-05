package day2retry;


import java.util.ArrayList;


public class Solution1 {
    ArrayList<Integer> list=new ArrayList<>();

    public int[] reversePrint(ListNode head) {
        if(head==null){
            return new int[0];
        }
        recur(head);
        int[] result=new int[list.size()];
        int j=0;
        for (int i = 0;i< list.size();i++) {
            result[j++]=list.get(i);
        }
        return result;
    }
    public void recur(ListNode head){

        if (head.next != null) {
            recur(head.next);
        }
        list.add(head.val);



    }
}
