package LeedCodes;

import java.util.HashMap;

public class firstIndexOfString {

    public int strStr(String haystack, String needle) {
        char[] ch=haystack.toCharArray();
        int k=-1;
         boolean bool=haystack.contains(needle);
         int l=haystack.indexOf(needle);

        if(bool){
            return l;
        }
        else
            return k;
    }
}
