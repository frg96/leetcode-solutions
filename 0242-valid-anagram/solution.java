class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Integer> sCharCount = new HashMap<>();

        for(char c : s.toCharArray()) {
            if(sCharCount.containsKey(c))
                sCharCount.put(c, sCharCount.get(c) + 1);
            else
                sCharCount.put(c, 1);
        }

        for(char c : t.toCharArray()) {
            if(sCharCount.containsKey(c)) {
                sCharCount.put(c, sCharCount.get(c) - 1);
                if(sCharCount.get(c) < 0)
                    return false;
            }
            else
                return false;
        }

        return true;
    }
}
