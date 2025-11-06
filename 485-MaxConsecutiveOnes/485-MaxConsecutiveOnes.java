// Last updated: 11/5/2025, 8:13:26 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int ans = 0;
       int count = 0;

       for(int n: nums){
        if(n == 0){
            count = 0;
        } else {
            count++;
        }
        if(ans < count){
            ans = count;
        }
       } 
       return ans;
    }
}