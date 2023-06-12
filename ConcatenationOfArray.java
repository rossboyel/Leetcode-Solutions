import java.util.Arrays;

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {

        int[] numsArr = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++) {
            numsArr[i] = nums[i];
            numsArr[i + nums.length] = nums[i];
            }

        return numsArr;
    }

}

