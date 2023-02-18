package day28retry;

import javax.sound.midi.Track;
import java.util.LinkedList;
import java.util.Queue;

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "[]";
        }
        StringBuffer sb=new StringBuffer("[");
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp=queue.remove();
            if(temp!=null){
                sb.append(temp.val+",");
                if(temp.left!=null){
                    queue.add(temp.left);
                }else {
                    queue.add(null);
                }

                if(temp.right!=null){
                    queue.add(temp.right);
                }else {
                    queue.add(null);
                }

            }else {
                sb.append("null"+",");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")){
            return null;
        }
        data=data.substring(1,data.length()-1);
        String[] vals=data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int k=1;

        /*
        while (!queue.isEmpty()){
            TreeNode temp=queue.remove();
            if(!vals[k].equals("null")){
                temp.left=new TreeNode(Integer.parseInt(vals[k]));
                queue.add(temp.left);
            }else {
                temp.left=null;
            }
            k++;
            if(!vals[k].equals("null")){
                temp.right=new TreeNode(Integer.parseInt(vals[k]));
                queue.add(temp.right);
            }else {
                temp.right=null;
            }
            k++;
        }
         */

        while (!queue.isEmpty()){
            TreeNode temp=queue.remove();
            if(!vals[k].equals("null")){
                temp.left=new TreeNode(Integer.parseInt(vals[k]));
                queue.add(temp.left);
                k++;
            }else {
                temp.left=null;
                k++;
            }

            if(!vals[k].equals("null")){
                temp.right=new TreeNode(Integer.parseInt(vals[k]));
                queue.add(temp.right);
                k++;
            }else {
                temp.right=null;
                k++;
            }

        }
        return root;

    }
}
