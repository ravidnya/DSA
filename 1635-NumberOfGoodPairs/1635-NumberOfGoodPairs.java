// Last updated: 11/5/2025, 8:13:22 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> pairs = new HashMap<>();
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(pairs.containsKey(nums[i])){
                count+=pairs.get(nums[i]);  
            }
            pairs.put(nums[i],pairs.getOrDefault(nums[i],0) + 1);
        }
        return count;
    }
}