package day23;

public class Solution2 {
//    public int[] constructArr(int[] a) {
//        if(a==null||a.length==0){
//            return a;
//        }
//        int length=a.length;
//        int[] left=new int[length];
//        int[] right=new int[length];
//        left[0]=1;
//        right[length-1]=1;
//        for (int i = 1; i < length; ++i) {
//            left[i]=left[i-1]*a[i-1];
//        }
//        for (int i =length-2; i >=0 ; --i) {
//            right[i]=right[i+1]*a[i+1];
//        }
//        for (int i = 0; i < length; i++) {
//            a[i]=left[i]*right[i];
//        }
//        return a;
//    }


    //改进
    public int[] constructArr(int[] a) {
        if(a==null||a.length==0){
            return a;
        }

        int[] res=new int[a.length];
        int temp=1;
        res[0]=1;

        for (int i = 1; i < a.length; ++i) {
            res[i]=res[i-1]*a[i-1];
        }
        for (int i =a.length-2; i >=0 ; --i) {
            temp *= a[i + 1];
            res[i] *= temp;
        }

        return res;
    }
}
