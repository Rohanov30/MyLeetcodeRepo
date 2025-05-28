package LeedCodes;

public class HappyNumber {
    public boolean isHappy(int num){    //246
        int sum=0;
        int rem=0;
        while(num!=0){
             rem=num%10;             //6
            num=num/10;// 24
            sum=sum+rem*rem;
        }
        System.out.print(sum);
     if(sum==rem) return true;

     return false;
    }
}
