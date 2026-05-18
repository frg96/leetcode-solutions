class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;

        int globalSumDiff = Integer.MAX_VALUE;
        int globalSum = 0;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i <= n-1; i++) {
            map.put(nums[i], i);
        }

        // System.out.println(map);

        for(int i = 0; i <= n-2; i++) {
            for(int j = i+1; j <= n-1; j++) {
                int desiredComplement = target - nums[i] - nums[j];
                // System.out.println(i + ": " + nums[i] + ", " + j + ": " + nums[j] + ", " + desiredComplement);

                var floorEntry = map.floorEntry(desiredComplement);
                var ceilEntry = map.ceilingEntry(desiredComplement);

                if(floorEntry != null) {
                    // System.out.println("\t"+floorEntry);
                    int key = floorEntry.getKey();
                    int value = floorEntry.getValue();

                    if(value != i && value != j){
                        int sum = key + nums[i] + nums[j];
                        int sumDiff = Math.abs(target - sum);
                        // System.out.println("\t\t"+sum + " "+ sumDiff);
                        if(sumDiff < globalSumDiff) {
                            globalSumDiff = sumDiff;
                            globalSum = sum;
                        }
                    }
                }

                if(ceilEntry != null) {
                    // System.out.println("\t"+ceilEntry);
                    int key = ceilEntry.getKey();
                    int value = ceilEntry.getValue();

                    if(value != i && value != j){
                        int sum = key + nums[i] + nums[j];
                        int sumDiff = Math.abs(target - sum);
                        // System.out.println("\t\t"+sum + " "+ sumDiff);
                        if(sumDiff < globalSumDiff) {
                            globalSumDiff = sumDiff;
                            globalSum = sum;
                        }
                    }
                }

            }
        }

        return globalSum;
    }
}
