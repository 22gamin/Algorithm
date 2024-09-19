import java.util.*;

class Solution
{
    public int solution(String s)
    {
    
        Stack<String> stack = new Stack<>();
        stack.push("1");
        
        for (char i : s.toCharArray()){
            String c = stack.peek();
            if (c.equals(Character.toString(i))){

                stack.pop();
                
            }
            
            else stack.push(Character.toString(i));
        }
        
        if (stack.peek().equals("1")) return 1;
        else return 0;

    }
}