class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> a = new HashMap<>();
        for(int num:nums){
            a.put(num,a.getOrDefault(num,0)+1);
        }
         for (int key : a.keySet()) {
            if (a.get(key) == 1)
                return key;
        }
               return -1;
    }
}