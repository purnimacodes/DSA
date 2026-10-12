// PLATFORM- GFG
//  Given an array arr[] of size n, which is sorted and then rotated around an unknown pivot, the task is to check whether there exists a pair of elements in the array whose sum is equal to a given target value.




class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        int n = arr.length;
      
     
      
      if(n < 2){ 
          return false;
      }
      
      int pivot = 0;
      
      for ( int i = 1; i<n; i++){
          if ( arr[i] < arr[pivot]){
              pivot = i;
          }
      }
      
        int left = pivot;
      
      int right =( pivot - 1 + n) %n;
      
      
      while( left != right){
          int sum = arr[left] + arr[right];
          
          if(sum == target){
              return true;
          } else if( sum  < target){
              left = (left + 1) %n;
      }
      else{
          right = (right - 1 + n)%n;
          
      }
      
  
    } // while loop closed
     
    return false;
    } // method closed
} //class closed
