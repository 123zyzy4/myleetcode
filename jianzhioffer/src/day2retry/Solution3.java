package day2retry;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public Node copyRandomList(Node head) {
        Node cur=head;
        if(head==null){
            return head;
        }
        Map<Node,Node> map=new HashMap<>();
        while(cur!=null){
            map.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur=head;
        while(cur!=null){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
            cur=cur.next;
        }
        return map.get(head);
    }
}
