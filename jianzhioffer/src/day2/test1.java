package day2;

public class test1 {
    public static void main(String[] args) {
        ListNode listNode1= new ListNode(2);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);
        Solution solution = new Solution();
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=null;
        int[] result=solution.reversePrint(listNode1);
        for (int i = 0; i <result.length; i++) {
            System.out.println(result[i]);
        }




    }
}
