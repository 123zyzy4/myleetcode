package day20retry;

public class Solution3 {
    public boolean verifyPostorder(int[] postorder) {
        return judge(postorder,0, postorder.length-1);
    }
    private boolean judge(int[] postorder,int left,int right){
        if(left>right){
            return true;
        }
        int division=left;
        while(postorder[division]<postorder[right]){
            division++;
        }
        int cur=division;
        while (postorder[cur]>postorder[right]){
            cur++;
        }
        return cur==right&&judge(postorder,left,division-1)&&judge(postorder,division,right-1);
    }

}
