// Last updated: 11/5/2025, 8:13:24 PM
class Solution {
    public int[] runningSum(int[] nums) {
       for(int i = 1; i < nums.length; i++){
        nums[i] = nums[i] + nums[i - 1];
       } 
       return nums;
    }
}