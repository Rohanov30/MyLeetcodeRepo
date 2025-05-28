package LeedCodes;

public class lastWordLength {

    public lastWordLength(String str ){
        str=str.trim();
        int ln=str.length();
        int count=0;
        int lastspace=str.lastIndexOf(" ");
        for(int i=lastspace+1;i<ln;i++){
            count++;
        }
        System.out.print(count);
    }
}
