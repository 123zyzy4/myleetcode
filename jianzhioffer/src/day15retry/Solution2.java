package day15retry;

public class Solution2 {
    Node head;
    Node pre=null;
    public Node treeToDoublyList(Node root) {
        if(root==null){
            return null;
        }
        inOrder(root);
        head.left=pre;
        pre.right=head;
        return head;
    }
    private void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        if(pre!=null){
            root.left=pre;
            pre.right=root;
            pre=root;
        }else{
            head=root;
            root.left=pre;
            pre=root;
        }

        inOrder(root.right);
    }
}
