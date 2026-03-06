class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);

        int n = s.length();

        boolean[] flag = new boolean[n + 1];
        Arrays.fill(flag, false);

        flag[0] = true;

        for(int i = 1; i <= n; i++) {
            String curr = s.substring(0, i);
            if(wordSet.contains(curr))
                flag[i] = true;
            else {
                for(int j = 0; j < i; j++){
                    if(flag[j] && wordSet.contains(s.substring(j, i))){
                        flag[i] = true;
                        break;
                    }
                }
            }

        }

        return flag[n];
    }
}
