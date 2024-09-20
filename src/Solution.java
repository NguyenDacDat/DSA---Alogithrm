import java.util.Stack;
public class Solution {
    public boolean isValid(String string){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<string.length();i++){
           if(string.charAt(i)=='('){
               stack.push(')');
           } else if (string.charAt(i)=='{') {
               stack.push('}');
           } else if (string.charAt(i)=='[') {
               stack.push(']');
           } else{
               if(stack.isEmpty()||stack.peek()!=string.charAt(i)){
                   return false;
               }else {
                 stack.pop();
               }
           }

        }
        return stack.isEmpty();
    }
}
