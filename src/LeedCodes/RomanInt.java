package LeedCodes;

import java.util.HashMap;
  //  I             1
   // V             5
  //  X             10
  //  L             50
  //   C             100
 //   D             500
 //   M             1000

public class RomanInt {
    public int romantiInt(String str){
        int n=0;
        char[] ch=str.toCharArray();
        int ln=str.length();
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for (int i = 0; i < ln; i++) {
            // Get the value of the current Roman numeral
            int currentVal = map.get(str.charAt(i));

            // Check if this is the last numeral or if the next numeral is smaller (subtractive case)
            if (i < ln - 1 && currentVal < map.get(str.charAt(i + 1))) {
                n =n- currentVal;  // Subtract the current value
            } else {
                n =n+currentVal;  // Add the current value
            }
        }

        return n;
    }

}
