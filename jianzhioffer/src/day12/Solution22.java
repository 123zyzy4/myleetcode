package day12;

public class Solution22 {
    //A先遍历a再遍历b的非公共部分
    //B先遍历b再遍历a的非公共部分
    //两个指针来到同一个位置，即公共部分第一个节点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;
    }

}
