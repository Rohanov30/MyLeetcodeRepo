package LeedCodes;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class subSequence {
        public boolean isSubsequence(String s, String t) {
            Queue<Character> q=new LinkedList<>();
            for(char c:s.toCharArray()){
                q.add(c);
            }
            for(char c : t.toCharArray()){
                if(!q.isEmpty() && c==q.peek()){
                    q.poll();
                }
            }


            return q.isEmpty();
        }
    }

