package basic.ds;

/**
 * Created by openworld on 15-4-16.
 */
public class selectSort implements iSort {


    @Override
    public int[] go(int[] a) {

        int position=0;
        for(int i=0;i<a.length;i++){
            int j=i+1;
            position=i;
            int temp=a[i];
            for(;j<a.length;j++){
                if(a[j]<temp){
                    temp=a[j];
                    position=j;
                }
            }
            a[position]=a[i];
            a[i]=temp;
        }


        return a;
    }
}
