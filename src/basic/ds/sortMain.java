package basic.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by openworld on 15-4-16.
 */
public class sortMain  {


    public static void main(String[] args) {


        int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
        int b[]={1,54,6,3,78,34,12,45,56,100};

        ArrayList<int[]> list = new ArrayList<int[]>();

        list.add(b);
        list.add(a);

        iSort sorter = new heapSort();
        Iterator<int[]> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(Arrays.toString(sorter.go(itr.next())));

        }
    }


}
