import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(twoSum(arr, 7)));
    }

    //Classic O(n) twosum solution
    //Iterate through array of numbers
    //Check if target - current value is present in the hashmap
    //If yes, we've got a solution so return the indices
    //If not, add key:value to hashmap and continue to next index

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int requiredNum = target - nums[i];
            if (hashMap.containsKey(requiredNum)) {
                return new int[]{i, hashMap.get(requiredNum)};
            }
            hashMap.put(nums[i], i);
        }

        return null;
    }
}
