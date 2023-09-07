import java.util.*;

public class TopKElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFreq(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5}, 3)));
    }

    //This code stands in defiance of Gods and men
    //It does it's job, that's all that can be asked
    private static int[] topKFreq(int[] nums, int k) {
        int[] returnVals = new int[k];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int val : nums) {
            if (hashMap.containsKey(val)) {
                hashMap.replace(val, hashMap.get(val) + 1);
            } else {
                hashMap.put(val, 1);
            }
        }

        for (int i = 0; i < k; i++) {
            int currMax = hashMap.get(Collections.max(hashMap.entrySet(), Map.Entry.comparingByValue()).getKey());
            returnVals[i] = currMax;
            hashMap.values().remove(currMax);
        }

        return returnVals;
    }
}
