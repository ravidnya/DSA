// Last updated: 11/5/2025, 8:13:29 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
       
       int[] output = new int[nums.length];
       for(int i = 0; i < nums.length; i++){
        output[i] = 1;
       }
       int left = 1;
       int right = 1;

       for(int i = 0; i < nums.length; i++){
        output[i] = left * output[i];
        left = left * nums[i];
       }

       for(int i = nums.length-1; i >= 0; i--){
        output[i] = right * output[i];
        right = right * nums[i];
       }

        return output;
    }
}