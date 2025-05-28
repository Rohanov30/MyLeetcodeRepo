package LeedCodes;

import java.util.*;

public class topKfrequent {

    public int[] frequentKElement(int[] arr,int k){
    int ln=arr.length;
    if(k==ln){
        return arr;
    }

        Map<Integer,Integer> map=new HashMap<>();
    for(int n: arr){
        map.put(n,map.getOrDefault(n,0)+1);
    }
    Queue<Integer> heap=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));


    for(int n: map.keySet()){
        heap.add(n);
        if(heap.size()>k){
            heap.poll();
        }
    }
    int[] ans=new int[k];
    for(int i=0;i<k;i++){
        ans[i]=heap.poll();
    }



return ans;
    }
}
