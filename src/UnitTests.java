import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTests extends Assertions{

    @Test
    public void SmallestSubTest(){
    //LC # 209 - Smallest Subarray with Greater Sum:
        System.out.println("Smallest Subarray with Greater Sum");
        SmallestSubGreaterSum sol = new SmallestSubGreaterSum();
        int [] arr = new int[]{2, 1, 5, 2, 3, 2};
        int target = 7, expected = 2;
        int actual = sol.findSum(arr, target);
        System.out.println("Test 1:\nExpected: " + expected + " \tActual: " + actual);
        assertEquals(expected, actual);
        arr = new int[]{2, 1, 5, 2, 8};
        target = 7;
        expected = 1;
        actual = sol.findSum(arr, target);
        System.out.println("\nTest 2:\nExpected: " + expected + " \tActual: " + actual);
        assertEquals(expected, actual);
        arr = new int[]{3, 4, 1, 1, 6};
        target = 8;
        expected = 3;
        actual = sol.findSum(arr, target);
        System.out.println("\nTest 3:\nExpected: " + expected + " \tActual: " + actual);
        assertEquals(expected, actual);
        arr = new int []{1,1,1,1,1,1,1,1};
        target = 11;
        expected = 0;
        actual = sol.findSum(arr, target);
        System.out.println("\nTest 4:\nExpected: " + expected + " \tActual: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void longestSubstringTest(){
        System.out.println("\nLongest Substring Without Repeating Characters:");
        LongestSubstringLength ll = new LongestSubstringLength();
        String str = "abcabcbb";
        int length = ll.lengthOfLongestSubstring(str);
        int expected = 3;
        assertEquals(expected, length);
        System.out.println("Test 1:\nExpected: " + expected + " \tActual: " + length);

        str = "bbbbb";
        length = ll.lengthOfLongestSubstring(str);
        expected = 1;
        System.out.println("Test 2:\nExpected: " + expected + " \tActual: " + length);

        str = "pwwkew";
        length = ll.lengthOfLongestSubstring(str);
        expected = 3;
        System.out.println("Test 3:\nExpected: " + expected + " \tActual: " + length);

    }
}
