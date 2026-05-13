import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public boolean isMatch(String s, String p) {
        Pattern pt = Pattern.compile("^" + p + "$");
        Matcher m = pt.matcher(s);

        return m.matches();
    }
}
