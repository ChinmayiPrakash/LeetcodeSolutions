class Solution {
   /* public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int val=0;
        String regex = "-?\\d+(\\.\\d+)?";
        if(tokens.length==1){
            return Integer.parseInt(tokens[0]);
        }
       // return str.matches(regex);
        for(int i =0;i<tokens.length;i++){
            if(tokens[i].matches(regex)){
                st.push(Integer.parseInt(tokens[i]));
            }else{
                int x=st.pop();
                int y=st.pop();
                String operator = tokens[i];
                val = evaluate(y,x,operator);
                st.push(val);
            }
        }
          return st.pop();  
            
        }
    
    static int evaluate(int y, int x, String op){
        int res=0;
        switch(op){
            case "+": res=(x+y);
                      break;
            case "-": res=(y-x);
                      break;
            case "*":res = x*y;
                      break;
            case "/":res = y/x;
                      break;
            
        }
       // if(res<=0){
         //   return 0;
        //}
        return res;
    }*/
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int d2 = stack.pop();
                int d1 = stack.pop();
                int res = 0;

                if (token.equals("+")) {
                    res = d1 + d2;
                } else if (token.equals("-")) {
                    res = d1 - d2;
                } else if (token.equals("*")) {
                    res = d1 * d2;
                } else if (token.equals("/")) {
                    res = d1 / d2;
                }
                stack.push(res);
            } else {
                stack.push(Integer.valueOf(token)); // Using Integer.valueOf()
            }
        }

        return stack.pop();
    }
    }
