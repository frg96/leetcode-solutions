class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        HashSet<List<Integer>> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i <= n-1; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i <= n-1; i++) {
            int target = -(nums[i]);

            for(int j = i+1; j <= n-1; j++) {
                int diff = target - nums[j];

                if(map.containsKey(diff)) {
                    int k = map.get(diff);

                    if(k != j && k != i) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }

        return new ArrayList<List<Integer>>(set);
    }
}
