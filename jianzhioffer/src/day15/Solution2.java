package day15;

public class Solution2 {
    Node pre=null,head=null;
    public Node treeToDoublyList(Node root) {
        if(root==null){
            return null;
        }
        inOrder(root);
        pre.right=head;
        head.left=pre;
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
        }else {
            head=root;
        }
        pre=root;
        inOrder(root.right);
    }
}
