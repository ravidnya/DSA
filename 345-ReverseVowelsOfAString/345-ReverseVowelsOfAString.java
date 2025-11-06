// Last updated: 11/5/2025, 8:13:28 PM
class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length - 1;
        while(left < right){
        while(left < right && !isVowel(c[left])){
            left++;
        }
        while(left < right && !isVowel(c[right])){
            right--;
        }

        char temp = c[left];
        c[left] = c[right];
        c[right] = temp;
        left++;
        right--;
        }
        return new String(c);
    }

    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
}