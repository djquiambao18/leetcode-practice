import java.util.HashSet;
import java.util.Set;

//Longest Substring with K Distinct Characters (medium)
public class LongestSubstrKDistinctChars {
    int lengthSubstr(String str, int K){
        int length = Integer.MIN_VALUE;
        if(str != null && str.length() > 0){
            Set<Character> set = new HashSet<Character>();
            //Sliding window:
            int startWindex = 0; //Window Index == Windex

            for(int i = 0; i < str.length(); i++){
                set.add(str.charAt(i));
                while(set.size() > K) {
                    length = Math.max(length, i - startWindex);


                }

            }

        }
        return length;
    }
}
