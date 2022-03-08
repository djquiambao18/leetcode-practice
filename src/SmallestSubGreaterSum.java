//Given an array of positive numbers and a positive number ‘S,’
// find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’.
// Return 0 if no such subarray exists.

public class SmallestSubGreaterSum {
    public SmallestSubGreaterSum(){}
    //arr = is array, s is the num need to find subarray sum greater than or equal to.
    public int findSum(int [] arr, int s)
    {
        int minLength = Integer.MAX_VALUE, maxSum = 0;
        if(arr.length > 0) {
            int startWindow = 0;
            for (int i = 0; i < arr.length; i ++){
                maxSum += arr[i];
                while(maxSum >= s){
                    minLength = Math.min(minLength, i - startWindow + 1);
                    maxSum -= arr[startWindow];
                    startWindow++;
                }
            }
        }
        return (minLength < Integer.MAX_VALUE? minLength : 0);
    }

}
