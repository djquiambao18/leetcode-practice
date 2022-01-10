public class AddBinary {
    int helper(int binaryNum){
        int pow_counter = 1;
        int runningTotal = 0;
        if(binaryNum == 0)
            return 0;
        if(binaryNum%10 == 1) //check if least significant bit is 1
            runningTotal++;
        //update binaryNum
        binaryNum/=10;
        while(binaryNum > 0) //since no leading zeros
        {
            int temp_bin_counter = binaryNum%10;
            if(temp_bin_counter == 1)
                runningTotal = runningTotal + (int) Math.pow(2, pow_counter);
            pow_counter++;
            binaryNum/=10;
        }
        return runningTotal;
    }
    public String binAdd(String a, String b) {
        int bin_a = Integer.parseInt(a);
        System.out.println(bin_a);

        int bin_b = Integer.parseInt(b);
        System.out.println(bin_b);
        int runningTotal = helper(bin_a);
        runningTotal = runningTotal + helper(bin_b);
        System.out.println(runningTotal + "\n");
        //string builder:
        StringBuilder strBuilder = new StringBuilder();

        while(runningTotal > 0){
            if(runningTotal%2==0)
                strBuilder.append("0");

            else
                strBuilder.append("1");
            runningTotal/=2;
        }
        return strBuilder.reverse().toString();
    }
}
