// Last updated: 11/5/2025, 8:13:37 PM
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right){
            int width = right -left;
            int leftHeight = height[left];
            int rightHeight = height[right];
            int minHeight = Math.min(leftHeight, rightHeight);

            max = Math.max(max, minHeight * width);

            if(leftHeight < rightHeight){
                left++;
            } else {
                right--;
            }
        }
        return max;    
    }
}