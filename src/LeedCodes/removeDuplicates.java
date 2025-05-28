package LeedCodes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class removeDuplicates {

    public int removeMethod(int[] arr,int v){
        int i=0;
        int ln=arr.length;
        while(i<ln){
            if(arr[i]==v){
                arr[i]=arr[ln-1];
                ln--;
            }
            else{
                i++;
            }
        }
System.out.print(Arrays.toString(arr));
   return i;
    }
}
