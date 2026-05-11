class Solution {
    public int reverse(int x) {
        boolean neg = x < 0 ? true : false;

        x = Math.abs(x);

        int y = x;
        int rev = 0;

        while(y > 0) {
            if(rev > Integer.MAX_VALUE / 10) {// bounds check
                return 0;
            }
            int digit = y % 10;
            rev = rev * 10 + digit;
            y = y / 10;
        }

        return neg? -rev : rev;
    }
}
