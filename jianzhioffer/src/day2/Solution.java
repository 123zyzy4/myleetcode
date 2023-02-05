package day2;

import java.util.ArrayList;

public class Solution {
    ArrayList<Integer> list=new ArrayList<Integer>();
    public int[] reversePrint(ListNode head) {

        Traversal(head);
        int[] result=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i]=list.get(i);
        }
        return result;
    }
    private void Traversal(ListNode head){
        if(head==null){
            return;
        }
        if (head.next != null) {
            Traversal(head.next);
        }
        list.add(head.val);
    }
}


