package day20;

public class Solution3 {
    int[] postorder;
    public boolean verifyPostorder(int[] postorder) {
        this.postorder=postorder;
        return judge(0, postorder.length-1);
    }
    private boolean judge(int i,int j){
        if(i>=j){
            return true;
        }
        int cur=i;
        while(postorder[cur]<postorder[j]){
            cur++;
        }
        int division=cur;
        while(postorder[cur]>postorder[j]){
            cur++;
        }
        return cur==j&&judge(i,division-1)&&judge(division,j-1);

    }
}
