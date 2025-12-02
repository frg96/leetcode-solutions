class Solution {
    public int romanToInt(String s) {
        int finalValue = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int value = map.get(current);;
            if(i < s.length() - 1) {
                char currentPlusOne = s.charAt(i+1);
                if(
                    (current == 'I' && (currentPlusOne == 'V' || currentPlusOne == 'X')) ||
                    (current == 'X' && (currentPlusOne == 'L' || currentPlusOne == 'C')) ||
                    (current == 'C' && (currentPlusOne == 'D' || currentPlusOne == 'M'))
                ) {
                    value = map.get(currentPlusOne) - map.get(current);
                    i++;
                }
            }
            finalValue += value;
        }

        return finalValue;
    }
}
