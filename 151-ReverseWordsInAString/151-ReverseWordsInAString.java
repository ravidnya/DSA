// Last updated: 11/5/2025, 8:13:32 PM
class Solution {
    public String reverseWords(String s) {

        String[] str = s.trim().split("\\s+");
        int left = 0;
        int right = str.length - 1;
        while(left < right){

                String temp = str[right];
                str[right] = str[left];
                str[left] = temp;
                left++;
                right--;
        }
        return String.join(" ", str);
    }
}