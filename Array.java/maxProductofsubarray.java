
  class Solution {
    public int maxProduct(int[] nums) {
        int currentMax = nums[0];
        int currentMin = nums[0];
        int globalMax = nums[0];

        for(int i = 1; i<nums.length; i++){
          int temp = Math.max(nums[i], Math.max(currentMax * nums[i], currentMin * nums[i]));
          currentMin = Math.min(nums[i], Math.min(currentMax * nums[i], currentMin * nums[i]));
          currentMax = temp;

          globalMax = Math.max(globalMax, currentMax);
        }
        return globalMax;
    }
}

