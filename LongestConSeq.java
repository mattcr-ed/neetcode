import java.util.HashSet;

public class LongestConSeq {
    public static void main (String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

    public static int longestConsecutive(int[] nums) {
        int lonCon = 0;
        HashSet<Integer> integerHashSet = new HashSet<>();
        for (int num : nums)
            integerHashSet.add(num);

        for (int num : nums) {
            if (!integerHashSet.contains(num - 1)) {
                int count = 1;
                while (integerHashSet.contains(num + 1)) {
                    count++;
                    num++;
                }
                lonCon = count;
            }
            if (lonCon > nums.length / 2) break;
        }

        return lonCon;
    }
}
