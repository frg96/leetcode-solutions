import java.math.BigInteger;

class Solution {
    public int myAtoi(String s) {
        boolean whitespace = true;
        boolean signedness = true;
        boolean conversion = true;
        boolean atleastOneDigit = false;

        StringBuilder builder = new StringBuilder();


        for(char c : s.toCharArray()) {
            if(whitespace && c == ' '){
                continue;
            }
            else if(signedness && (c == '-' || c == '+')) {
                if(whitespace)
                    whitespace = false;
                signedness = false;
                builder.append(c);
            }
            else if(conversion && Character.isDigit(c)) {
                if(whitespace)
                    whitespace = false;
                if(signedness) 
                    signedness = false;
                
                if(!atleastOneDigit)
                    atleastOneDigit = true;
                
                builder.append(c);
            }
            else {
                if(whitespace)
                    whitespace = false;
                if(signedness) 
                    signedness = false;
                if(conversion)
                    conversion = false;

                break;
            }
        }


        if(!atleastOneDigit)
            builder.append('0');
        
        String num = builder.toString();
        System.out.println(num);

        BigInteger bi = new BigInteger(num);
        BigInteger MAX_INT = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger MIN_INT = BigInteger.valueOf(Integer.MIN_VALUE);

        if(bi.compareTo(MIN_INT) < 0)
            return Integer.MIN_VALUE;
        else if(bi.compareTo(MAX_INT) > 0)
            return Integer.MAX_VALUE;
        else
            return bi.intValue();
    }
}
