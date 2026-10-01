// platform - leetcode
// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

//For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].




public class permutation {
  class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i >= 0){
            int j = nums.length - 1;
            while(nums[j]<= nums[i]){
                j--;
            }
            swap(nums, i ,j);
        }
        reverse(nums, i+1, nums.length - 1);
    }
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void reverse(int[] nums, int left, int right){
        while(left<right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
  
}
