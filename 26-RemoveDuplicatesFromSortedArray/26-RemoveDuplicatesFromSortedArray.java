// Last updated: 11/5/2025, 8:13:36 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int left = 0;

        for(int right = 1; right< nums.length; right++){
            if(nums[right] != nums[left]){
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
}