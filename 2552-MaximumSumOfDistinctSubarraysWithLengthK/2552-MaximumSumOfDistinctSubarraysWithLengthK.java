// Last updated: 11/5/2025, 8:13:21 PM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        long currentSum = 0;
        int left = 0, right = 0;

        HashMap<Integer, Integer> lastSeen = new HashMap<>();

        while(right < nums.length){
            int curr = nums[right];
            int lastOccur = lastSeen .getOrDefault(curr, -1);

            while(left <=lastOccur || right - left + 1 > k){
                currentSum -= nums[left];
                left++; 
            }
            lastSeen.put(curr,right);
            currentSum += nums[right];

            if(right - left + 1 == k){
                ans = Math.max(ans, currentSum);
            }
            right++;
        }
        return ans;
    }
}