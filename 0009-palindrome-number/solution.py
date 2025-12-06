class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        elif x == 0:
            return True
        
        num = x
        rev = 0
        while (num > 0):
            units = num % 10
            rev = rev * 10 + units
            num = num // 10
        
        if x == rev:
            return True
        else:
            return False
        
