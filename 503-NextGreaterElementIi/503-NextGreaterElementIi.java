// Last updated: 11/6/2025, 12:44:25 AM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        Stack<Integer> st = new Stack<>(); 

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;
            int val = nums[idx];

            while (!st.isEmpty() && nums[st.peek()] <= val) {
                st.pop();
            }

            if (!st.isEmpty()) {
                res[idx] = nums[st.peek()];
            }

            st.push(idx);
        }

        return res;
    }
}