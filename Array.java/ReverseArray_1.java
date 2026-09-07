// PLATFORM-GFG
//Q.REVERSE THE ARRAY



public class ReverseArray_1 {
  class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int [] arr_1= {1,4,3,2,6,5};
        int start =0;
        int end =arr.length-1;
        
        while(start<end) {
            int temp = arr[start];
            
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        
    }
}
  
}
