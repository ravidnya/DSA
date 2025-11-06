// Last updated: 11/5/2025, 8:13:23 PM
class Solution {
    public int countPartitions(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int sum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            prefixSum[i] = sum;
        }
        for(int j = 0; j < nums.length-1; j++){
            int rightSum = 0;
            rightSum = Math.abs(sum - prefixSum[j]);
            if((rightSum - prefixSum[j])%2 == 0){
                count++;
            }
        }
        return count;
    }
}