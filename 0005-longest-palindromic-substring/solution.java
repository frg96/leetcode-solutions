class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        
        if(n == 1)
            return s;

        int i = 0;
        String longestPalindrome = "";
        int maxLength = 0;

        while(i < n) {
            int l = i, r = i;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            l++;
            r--;

            if(r - l + 1 > maxLength) {
                longestPalindrome = s.substring(l, r+1);
                maxLength = r - l + 1;
                System.out.println(longestPalindrome + " " + maxLength);
            }
            
            if(i < n-1 && s.charAt(i) == s.charAt(i+1)) {
                // even length palindrome
                l = i;
                r = i+1;

                while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                }
                l++;
                r--;

                if(r - l + 1 > maxLength) {
                    longestPalindrome = s.substring(l, r+1);
                    maxLength = r - l + 1;
                    System.out.println(longestPalindrome + " " + maxLength);
                }
            }

            if(i > 0 && i < n-1 && s.charAt(i-1) == s.charAt(i+1)) {
                // odd length palindrome
                l = i-1;
                r = i+1;

                while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                }
                l++;
                r--;

                if(r - l + 1 > maxLength) {
                    longestPalindrome = s.substring(l, r+1);
                    maxLength = r - l + 1;
                    System.out.println(longestPalindrome + " " + maxLength);
                }
            }

            

            
            i++;
        }

        return longestPalindrome;
    }
}
