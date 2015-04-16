package basic.ds;

/**
 * Created by openworld on 15-4-16.
 */
public class bubbleSort implements iSort {

    @Override
    public int[] go(int[] a) {
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
}
