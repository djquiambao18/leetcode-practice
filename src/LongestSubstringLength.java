import java.util.HashSet;
import java.util.Set;

// Given a string s, find the length of the longest substring without repeating characters.
public class LongestSubstringLength {
    public int lengthOfLongestSubstring(String s) {
        int longest = Integer.MIN_VALUE;
        if(s.length() > 0){
            //sliding window problem
            int windowStart = 0, windowEnd = 0;
            Set<Character> set = new HashSet<>();

            while(windowEnd < s.length()){
                if(!set.contains(s.charAt(windowEnd))){
                    set.add(s.charAt(windowEnd));
                    windowEnd++;
                }
                else{
                    set.remove(s.charAt(windowStart));
                    windowStart++;
                }
                longest = Math.max(longest, windowEnd - windowStart);
            }
        }
        return (longest > Integer.MIN_VALUE ? longest : 0);
    }
}
