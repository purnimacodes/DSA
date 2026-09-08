// PLATFORM-Leetcode
//Q. Contains duplicate
// nums[] ={1,2,3,4,1}





import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer>set = new HashSet<>();
       for(int i=0; i<nums.length; i++){
       int num = nums[i];
       if(set.contains
       (num)){
        return true;
       }
       set.add(num);
       }
       return false;
    }
}
          