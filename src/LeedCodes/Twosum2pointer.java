package LeedCodes;

public class Twosum2pointer {

    public int[] twoSum(int[] arr,int k){
  int left=0;
  int right=arr.length-1;
  int sum=0;
  while(left<right){
      sum=arr[left]+arr[right];
      if(sum>k){
          right--;
      }
      else if(sum<k){
          left++;
      }
      else if(sum==k){
          return new int[] {left,right};
      }
  }

        return new int[] {};
    }
}
