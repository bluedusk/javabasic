package basic.ds;

import java.util.Arrays;

/**
 * Created by openworld on 15-4-16.
 */
public class shellSort implements  iSort{



    public int[] go(int[] a) {

        double d1=a.length;
        int temp;

        while(true){
            d1= Math.ceil(d1/2);
            int d=(int) d1;
            for(int x=0;x<d;x++){

                for(int i=x+d;i<a.length;i+=d){
                    int j=i-d;
                    temp=a[i];
                    for(;j>=0&&temp<a[j];j-=d){
                        a[j+d]=a[j];
                    }
                    a[j+d]=temp;
                }
            }

            if(d==1){
                break;
            }
        }
        return a;

    }


}
