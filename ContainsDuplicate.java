import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicates(new int[]{1, 3, 2, 4}));
    }

    //Using HashMap results in an O(n) time and weight solution
    //We iterate through the array, checking if the value is in the hashmap
    //If it's in, return true
    //Not in, add to hashmap and continue
    //With no more indices, return false
    private static boolean containsDuplicates(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                return true;
            }
            hashMap.put(arr[i], i);
        }

        return false;
    }
}