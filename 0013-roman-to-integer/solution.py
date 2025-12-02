class Solution:
    def romanToInt(self, s: str) -> int:
        final_value = 0

        map = {
            'I' : 1,
            'V' : 5,
            'X' : 10,
            'L' : 50,
            'C' : 100,
            'D' : 500,
            'M' : 1000
        }

        i = 0

        while (i < len(s)) :
            current = s[i]
            value = map[current]
            if i < (len(s) - 1):
                current_plus_one = s[i+1]
                if (current == 'I' and (current_plus_one == 'V' or current_plus_one == 'X') or \
                    current == 'X' and (current_plus_one == 'L' or current_plus_one == 'C') or \
                    current == 'C' and (current_plus_one == 'D' or current_plus_one == 'M')):
                    value = map[current_plus_one] - map[current]
                    i = i + 1
            final_value = final_value + value
            i = i+1

        return final_value


        
