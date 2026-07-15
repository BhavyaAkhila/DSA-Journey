class Solution {
    public int maxProduct(int[] nums) {

        int currentmax = nums[0];
        int currentmin = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < 0) {
                int temp = currentmax;
                currentmax = currentmin;
                currentmin = temp;
            }

            currentmax = Math.max(nums[i], currentmax * nums[i]);
            currentmin = Math.min(nums[i], currentmin * nums[i]);

            ans = Math.max(ans, currentmax);
        }

        return ans;
    }
}
