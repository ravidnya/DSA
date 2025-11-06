// Last updated: 11/5/2025, 8:13:30 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> nSet = new HashSet<Integer>();
        for(int num: nums){
            if(nSet.contains(num)){
                return true;
            }
            nSet.add(num);
        }
        return false;
    }
}