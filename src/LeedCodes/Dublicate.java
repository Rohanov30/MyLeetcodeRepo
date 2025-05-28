package LeedCodes;

import java.util.HashSet;

public class Dublicate
{
public boolean checkDublicate(int[] arr){
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<arr.length;i++){
   if(set.add(arr[i])==false)

                return true;
            }


    return false;

}
}
