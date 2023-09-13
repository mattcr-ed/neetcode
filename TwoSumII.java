import java.util.Arrays;
import java.util.HashMap;

public class TwoSumII {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(twoSum(new int[]{-1, 0}, -1)));
    }

    //Array will already be sorted
    //Create left/right pointers
    //Iterate from left to right pointer, checking if target reached
    //If yes, return indices
    //If no, move right pointer left 1 space
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int right = numbers.length - 1; right > 0; right--) {
            for (int left = 0; left < numbers.length; left++) {
                if (numbers[right] + numbers[left] == target) {
                    result[0] = left + 1;
                    result[1] = right + 1;
                    return result;
                }
            }
        }

        return result;
    }
}
