public class Main {

    public static void main(String[] args) {
	// write your code here
//        AddBinary binaryAdd = new AddBinary();
//        String str = binaryAdd.binAdd("1010", "1011");
//        System.out.println(str);

        //LC # 209 - Smallest Subarray with Greater Sum:
        SmallestSubGreaterSum sol = new SmallestSubGreaterSum();

        int [] arr = new int[]{2, 1, 5, 2, 3, 2};
        int target = 7, expected = 2;
        System.out.println("Test 1\nActual: " + sol.findSum(arr, target) + "\nExpected: " + expected);
        arr = new int[]{2, 1, 5, 2, 8};
        target = 7;
        expected = 1;
        System.out.println("\nTest 2\nActual: " + sol.findSum(arr, target) + "\nExpected: " + expected);
        arr = new int[]{3, 4, 1, 1, 6};
        target = 8;
        expected = 3;
        System.out.println("\nTest 3\nActual: " + sol.findSum(arr, target) + "\nExpected: " + expected);
        arr = new int []{1,1,1,1,1,1,1,1};
        target = 11;
        expected = 0;
        System.out.println("\nTest 4\nActual: " + sol.findSum(arr, target) + "\nExpected: " + expected);

    }
}
