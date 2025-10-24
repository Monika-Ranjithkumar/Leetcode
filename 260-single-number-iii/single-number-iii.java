class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap <Integer,Integer> a = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num:nums){
            a.put(num,a.getOrDefault(num,0)+1);
        }
        for(int k:a.keySet()){
            if(a.get(k)==1){
                list.add(k);
            }
        }
       int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}