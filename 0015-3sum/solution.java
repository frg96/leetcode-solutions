class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        HashSet<List<Integer>> set = new HashSet<>();

        for(int i = 0; i <= n-1; i++) {
            if(nums[i] > 0)
                break;

            if(i > 0 && nums[i] == nums[i-1])
                continue;
            
            int lo = i+1;
            int hi = n-1;

            while(lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if(sum == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[lo]);
                    list.add(nums[hi]);
                    set.add(list);

                    lo++;
                    hi--;
                }
                else if(sum < 0)
                    lo++;
                else
                    hi--;
            }
        }

        return new ArrayList<>(set);
    }
}
