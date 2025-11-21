class Solution {
    public boolean isPalindrome(String s) {
        String org = s.toLowerCase().replaceAll("[^a-z0-9]", "" );
        return new StringBuilder(org).reverse().toString().equals(org);
    }
}
