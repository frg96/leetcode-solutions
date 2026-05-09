class Solution {
    public int minAddToMakeValid(String s) {
        // empty string
        if(s.length() == 0)
            return 0;
        
        Deque<Character> stack = new ArrayDeque<>();

        // looping over each char
        for(char c : s.toCharArray()){
            if(c == '(')
                stack.push(c);
            else {
                if(!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    stack.push(c);
            }
        }

        int open = 0;
        int close = 0;

        while(!stack.isEmpty()) {
            char c = stack.pop();
            if(c == '(')
                open++;
            else
                close++;
        }

        return open + close;
    }
}
