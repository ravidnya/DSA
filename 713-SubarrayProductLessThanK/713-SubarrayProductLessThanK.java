// Last updated: 11/5/2025, 8:13:25 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int left = 0, right = 0, product = 1, count = 0;
        int n = nums.length;
        while(right < n){
            product *= nums[right];
            while(product >=k) product /=nums[left++];
            count+= (right -left) + 1;
            right++;
        }
        return count;
    }
}