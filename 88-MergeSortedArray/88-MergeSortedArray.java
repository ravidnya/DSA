// Last updated: 11/5/2025, 8:13:34 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mid = m-1; //index pointing to num1
        int nid = n-1; //index pointing to num2
        int right = m + n - 1;

        while(nid >= 0){
            if(mid >= 0 && nums1[mid]>nums2[nid]){
                nums1[right] = nums1[mid];
                mid--;
            } else {
                nums1[right] = nums2[nid];
                nid--;
            }
            right--;
        }

    }
}