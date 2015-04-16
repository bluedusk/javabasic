package basic.ds;

import java.util.Arrays;

/**
 * Created by openworld on 15-4-16.
 */
public class InsertSort implements iSort {

    public int[] go(int[] a){
        int temp;
        for(int i=1;i<a.length;i++){
            int j=i-1;
            temp=a[i];
            for(;j>=0&&temp<a[j];j--){
                a[j+1]=a[j];  //将大于temp的值整体后移一个单位
            }
            a[j+1]=temp;
        }
        return a;
    }

}

