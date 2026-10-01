//PLATFORM- Leetcode
//Q.

//53. Maximum Subarray
//Medium
//Topics
//Given an integer array nums, find the subarray with the largest sum, and return its sum.


  class Solution {
   
    public int maxSubArray(int[] nums) {
        int [] nums_1={-2,1,-3,4,-1,2,1,-5,4};
        int currentSum=nums[0];
        int maxSum=nums[0];
        for(int i=1; i<nums.length; i++){
            
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
  }
  }