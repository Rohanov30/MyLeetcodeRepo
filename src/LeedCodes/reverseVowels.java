package LeedCodes;

import java.util.Arrays;
public class reverseVowels{
public String reverseVowels(String s) {
    int ln = s.length();
    int left = 0;
    int right = ln - 1;
    char[] ch = s.toCharArray();

    while (left < right) {
        if (isvowel(ch[left]) && isvowel(ch[right])) {
            // Corrected: use ch[] instead of s.charAt()
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        } else {
            if (!isvowel(ch[left])) left++;
            if (!isvowel(ch[right])) right--;
        }
    }

    return new String(ch); // Corrected: don't use Arrays.toString()
}

public boolean isvowel(char ch) {
    // Added uppercase vowels too
    return "aeiouAEIOU".indexOf(ch) != -1;
}
}