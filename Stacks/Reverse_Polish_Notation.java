import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<String> stack = new Stack<>();
       int a=0;
       int b=0;
       int res =0;

       for (int i = 0; i < tokens.length; i++) {
        
        String op = tokens[i];
        if ((op =="+") || (op =="-") || (op =="*") || (op =="/")) {
            b=Integer.parseInt(op);
            a=Integer.parseInt(op);

            if (op.equals("+")) {
                res = a+b;
            }
            else if (op.equals("-")) {
                res = a-b;
            }
            else if (op.equals("*")) {
                res = a*b;
            }
            else if (op.equals("/")) {
                res = a/b;
            }
            else{
                stack.push(op);
                stack.push(String.valueOf(res));
            }
        }
       }
       return res;
    }
}
