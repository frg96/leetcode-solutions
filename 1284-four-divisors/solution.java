class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;

        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            List<Integer> factors = new ArrayList<>();
            for(int j = 1; j <= Math.sqrt(n); j++) {
                if(n % j == 0) {
                    if(n / j == j) {
                        factors.add(j);
                    }
                    else {
                        factors.add(j);
                        factors.add(n/j);
                    }
                }
            }
            System.out.println(factors);
            if(factors.size() == 4) {
                for(int x : factors)
                    totalSum += x;
            }
                
        }

        return totalSum;
    }
}
