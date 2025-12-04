class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if(c == ')') {
                if(stack.peek() != null){
                    if(stack.pop() != '(')
                        return false;
                }
                else
                    return false;
            }
            else if(c == ']') {
                if(stack.peek() != null){
                    if(stack.pop() != '[')
                        return false;
                }
                else
                    return false;  
            }
            else if(c == '}') {
                if(stack.peek() != null){
                    if(stack.pop() != '{')
                        return false;
                }
                else
                    return false;  
            }
        }

        if(stack.size() != 0)
            return false;
        else
            return true;
    }
}
