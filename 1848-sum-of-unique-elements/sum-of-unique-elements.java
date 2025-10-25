import java.util.HashMap;

class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int sum = 0;

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }
}
