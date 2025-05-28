package LeedCodes;

public class ThreesumPointer
{
    public int[] threesum(int[] arr,int k){
        int left=0;
        int right=arr.length-1;
        int temp=right/2;
        while(left<right){
           int sum=arr[left]+arr[right];
           if(sum>k){
               right--;
           }
           else if(sum<k){
               left++;
           }

            }
        return new int[] {};
    }

}
