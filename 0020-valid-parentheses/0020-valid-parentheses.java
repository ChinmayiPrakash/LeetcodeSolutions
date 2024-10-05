class Solution {
    public boolean isValid(String s) {
       Stack<Character> stk = new Stack<>();

        // Edge case: if the length is odd, it's automatically invalid
        if (s.length() % 2 != 0) {
            return false;
        }

        // Iterate over the string from left to right
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Push opening brackets onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stk.push(c);
            } else {
                // If closing bracket appears and stack is empty, return false
                if (stk.isEmpty()) {
                    return false;
                }

                // Check for matching pairs
                char top = stk.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // If stack is empty after processing, all pairs are matched
        return stk.isEmpty();
    }
}