import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"rat","tar","cat","tac","dog"};
        System.out.println(groupedAnagrams(strs));
    }

    private static List<List<String>> groupedAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!hashMap.containsKey(sorted)) {
                hashMap.put(sorted, new ArrayList<>());
            }

            hashMap.get(sorted).add(word);
        }

        return new ArrayList<>(hashMap.values());
    }
}
