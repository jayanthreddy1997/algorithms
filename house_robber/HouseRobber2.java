class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        int maxCash = 0;

        // pick 0th house case;
        int maxRobbed0 = nums[0];
        int maxRobbed1 = maxRobbed0;
        int temp;

        for(int i=2; i<(n-1); i++) {
            temp = maxRobbed1;
            maxRobbed1 = Math.max(maxRobbed1, maxRobbed0+nums[i]);
            maxRobbed0 = temp;
        }

        maxCash = Math.max(maxCash, maxRobbed1);

        // dont pick 0th house case;
        maxRobbed0 = 0;
        maxRobbed1 = nums[1];

        for(int i=2; i<n; i++) {
            temp = maxRobbed1;
            maxRobbed1 = Math.max(maxRobbed1, maxRobbed0+nums[i]);
            maxRobbed0 = temp;
        }

        maxCash = Math.max(maxCash, maxRobbed1);

        return maxCash;
    }
}