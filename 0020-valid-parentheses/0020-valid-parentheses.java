class Solution {
    public boolean isValid(String s) {
    /*  int n = s.length();
        Stack<Character> st = new Stack<>();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }else {
                if (st.isEmpty()) {
                    return false;
                }
                if ((s.charAt(i) == ')' && st.pop() != '(') || (s.charAt(i) == ']' && st.pop() != '[') || (s.charAt(i) == '}' && st.pop() != '{')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }*/
         while(s.contains("()") || s.contains("[]") || s.contains("{}")){
            s=s.replace("()","");
            s=s.replace("[]","");
            s=s.replace("{}","");
        }
        return s.isEmpty();
    }
}