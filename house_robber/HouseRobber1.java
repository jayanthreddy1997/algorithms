class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n==1)
            return nums[0];

        int temp;
        int maxRobbed0 = nums[0];
        int maxRobbed1 = Math.max(nums[0], nums[1]);
        for(int i=2; i<n; i++) {
            temp = maxRobbed1;
            maxRobbed1 = Math.max(maxRobbed1, maxRobbed0+nums[i]);
            maxRobbed0 = temp;
        }

        return maxRobbed1;
    }
}