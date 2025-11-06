// Last updated: 11/5/2025, 8:13:39 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
         // Map to store number and its index
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i]; // Number needed to reach target
        if (map.containsKey(complement)) {
            // Found the pair, return their indices
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i], i); // Store current number and its index
    }
    return new int[0]; // No solution found (shouldn't happen per problem statement)
    
    }
}