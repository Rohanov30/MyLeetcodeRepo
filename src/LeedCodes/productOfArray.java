package LeedCodes;

import java.util.PriorityQueue;
import java.util.Queue;

public class productOfArray {
    public int[] pdtexceptself(int[] arr){
       int pdt=1;
        for(int i:arr){
           pdt=pdt*i;
       }
        for(int i=0;i<arr.length;i++){
            arr[i]=pdt/arr[i];
        }

    return arr;
    }
}
