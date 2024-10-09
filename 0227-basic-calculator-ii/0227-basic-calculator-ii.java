class Solution {
    int getops(int num1, int num2, char ch) {
        switch (ch) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            default: return 0;
        }
    }

    public int calculate(String s1) {
        Stack<Integer> numStack = new Stack<>();
        char lastOp = '+'; // Track the last operator (default to '+')
        int num = 0;
        s1 = s1.replaceAll(" ", ""); // Remove spaces
        int i = 0;

        while (i < s1.length()) {
            char ch = s1.charAt(i);

            // Parse numbers
            if (Character.isDigit(ch)) {
                num = 0;
                while (i < s1.length() && Character.isDigit(s1.charAt(i))) {
                    num = num * 10 + (s1.charAt(i) - '0');
                    i++;
                }

                // Apply the last operator before this number
                if (lastOp == '+') {
                    numStack.push(num);
                } else if (lastOp == '-') {
                    numStack.push(-num);
                } else if (lastOp == '*') {
                    numStack.push(numStack.pop() * num);  // Apply * with the last number
                } else if (lastOp == '/') {
                    numStack.push(numStack.pop() / num);  // Apply / with the last number
                }
            } else {
                // If it's an operator, store it and move to the next character
                lastOp = ch;
                i++;
            }
        }

        // Sum up all values in the stack
        int result = 0;
        while (!numStack.isEmpty()) {
            result += numStack.pop();
        }

        return result;
    }
}
