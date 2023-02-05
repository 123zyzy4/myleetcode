package day2;

public class test2 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        Node node1 = new Node(5);
        Node node2 = new Node(3);
        Node node3 = new Node(7);
        node1.next=node2;
        node2.next=node3;
        node3.next=null;
        node1.random=node3;
        node2.random=node1;
        node3.random=node2;
        Node newhead=solution3.copyRandomList(node1);
        while (newhead != null) {
            System.out.println(newhead.val);
            newhead=newhead.next;
        }



    }
}
