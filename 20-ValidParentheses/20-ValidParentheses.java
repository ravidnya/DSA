// Last updated: 11/5/2025, 8:13:37 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] chars = s.toCharArray();
        if (s == null || (s.length() & 1) == 1) return false;

        for(char ch: chars){
            // openers
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // closers
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) return false;           // avoid peek on empty
                char top = st.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) return false;  // single place to fail
            }
            // if any other character must be rejected:
            else {
                return false; // or `continue;` if you want to ignore non-brackets
            }
        }
        return st.isEmpty();
    }
}