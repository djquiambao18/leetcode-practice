public class Main {

    public static void main(String[] args) {
	// write your code here
//        AddBinary binaryAdd = new AddBinary();
//        String str = binaryAdd.binAdd("1010", "1011");
//        System.out.println(str);
        UnitTests unitTests = new UnitTests();
        //Easy:
        unitTests.SmallestSubTest();
        unitTests.longestSubstringTest();

        //Medium:
        unitTests.longestSubstrKDistinctChars();


    }
}
