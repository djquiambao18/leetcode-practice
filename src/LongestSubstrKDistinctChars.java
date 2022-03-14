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
                set.add(str.charAt(i)); //add elements to the set to ensure that there is at max K Distinct characters.
                //if size exceeds K then the longest substr needs to be reduced (window Size reduced since substring)
                while(set.size() > K) {
                    length = Math.max(length, i - startWindex);
                    set.remove(str.charAt(startWindex++));  //remove elements from set that matches the characters while closing the window
                }
            }
        }
        return length;
    }
}
