package LeedCodes;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeAlternateString {
    public static void main(String[] args) {
        MergeAlternateString ms=new MergeAlternateString();
        System.out.print(ms.mergeString("abc","pqr"));
    }


    public String mergeString(String str1,String str2) {
        int ln = str1.length();
        int ln2 =str2.length();
   StringBuffer list= new StringBuffer();
        int i=0,j=0;
        while(i<ln || j<ln2){
            if(i<ln) list.append(str1.charAt(i++));
            if(j<ln2) list.append(str2.charAt(j++));
        }



        return list.toString();
    }
}
