package day17;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class MedianFinder {
    LinkedList<Integer> list;
    int cur;//用于取出中位数的指针
    public MedianFinder() {
        list=new LinkedList<>();
        cur=-1;
    }

    public void addNum(int num) {
        int low=0,high= list.size()-1;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(list.get(mid)<num){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
//        while(i< list.size()&&list.get(i)<num){
//            i++;
//        }
        list.add(low,num);
        if(list.size()%2==1){
            cur++;
        }


    }

    public double findMedian() {
        if(list.size()==0){
            return -1.0;
        }
        if(list.size()%2==1){
            return list.get(cur);
        }else {
            return (list.get(cur)+list.get(cur+1))/2.0;
        }
    }
    @Test
    public void test(){
        int num1=7;
        int num2=2;
        int num3=3;
        int num4=0;
        int num5=1;
        MedianFinder obj = new MedianFinder();
        int num6=6;
        int num7=5;
        int num8=3;
        int num9=2;

        obj.addNum(num1);
        obj.addNum(num2);
        obj.addNum(num3);
        obj.addNum(num4);
        obj.addNum(num5);
        obj.addNum(num6);
        obj.addNum(num7);
        obj.addNum(num8);
        obj.addNum(num9);


       // obj.addNum(num3);
        double param_2 = obj.findMedian();

    }
}
