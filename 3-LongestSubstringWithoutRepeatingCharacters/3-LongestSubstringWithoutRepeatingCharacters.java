// Last updated: 11/5/2025, 8:13:38 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0;
        Map< Character, Integer> lastSeen = new HashMap<>();

        for(int right = 0; right <s.length(); right++){
            char c = s.charAt(right);
            if(lastSeen.containsKey(c) && lastSeen.get(c) >=left){
                left = lastSeen.get(c) +1; 
            }
            ans = Math.max(ans, right - left + 1);
            lastSeen.put(c, right);
        }
        return ans;
    }
}