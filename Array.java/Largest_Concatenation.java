// PLATFORM- GFG



//Given an array of non-negative integers arr[], arrange them such that their concatenation forms the largest possible number. Return the result as a string, since it may be too large for standard integer types.

//Examples:

//Input: arr[] =  [3, 30, 34, 5, 9]
//Output: 9534330
//Explanation: The arrangement [9, 5, 34, 3, 30], gives the largest value 9534330.

//Input: arr[] =  [54, 546, 548, 60]
//Output: 6054854654
//Explanation: The arrangement [60, 548, 546, 54], gives the largest value 6054854654.

import java.util.Arrays;

class Solution {
    public String findLargest(int[] arr) {
        // code here
        int n = arr.length;
        
        //convert integer array into string array
        String[]  nums = new String[n];
        
        for(int i = 0; i<n; i++){
            nums[i] = String.valueOf(arr[i]);
        }
        
        //custom sorting 
       Arrays.sort(nums, (a, b) -> {
            return(b + a).compareTo(a + b);
        });
        
        // handle all zeros
        if(nums[0].equals("0")) {
            return "0"  ; 
             }
             
             //concatenate all numbers
             StringBuilder ans = new StringBuilder();
             
             for(String num : nums){
                 ans.append(num);
             }
             
             return ans.toString();
             
    }
    
}




