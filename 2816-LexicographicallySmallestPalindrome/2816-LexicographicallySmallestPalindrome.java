// Last updated: 11/5/2025, 8:13:22 PM
class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] a = s.toCharArray();

        int left = 0;
        int right = a.length - 1;

        while(left < right){
            if(a[left] != a[right]){
               char smaller = (char) Math.min(a[left], a[right]);
                a[left] = a[right] = smaller;
            }
            left++;
            right--;
        }
        return new String(a);
    }
}