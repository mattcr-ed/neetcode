import java.util.Arrays;

public class ProdOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int tVal = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    tVal *= nums[j];
                }
            }
            result[i] = tVal;
        }
        return result;
    }
}
