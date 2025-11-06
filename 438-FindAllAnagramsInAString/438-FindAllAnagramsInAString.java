// Last updated: 11/5/2025, 8:13:27 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        if(s.length() < p.length()){
            return list;
        }

        int[] fs = new int[26];
        int[] fp = new int[26];

        for(int i = 0; i < p.length(); i++){
            fs[s.charAt(i) - 'a']++;
            fp[p.charAt(i) - 'a']++;
        }

        if(Arrays.equals(fs,fp)){
            list.add(0);
        }

        int left = 0;
        int right = p.length();

        while(right < s.length()){
            fs[s.charAt(left) - 'a']--;
            fs[s.charAt(right) - 'a']++;

            if(Arrays.equals(fs,fp)){
            list.add(left+1);
        }
        left++;
        right++;
        }
        return list;
    }
}