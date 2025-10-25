import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> occurrenceSet = new HashSet<>();
        for (int count : frequencyMap.values()) {
            if (!occurrenceSet.add(count)) {
                return false;
            }
        }

        return true;
    }
}
