
 // platform- leetcode
//Given an integer array nums and an integer k, return the kth largest element in the array.

//Note that it is the kth largest element in the sorted order, not the kth distinct element.

//Can you solve it without sorting?

 

//Example 1:

//Input: nums = [3,2,1,5,6,4], k = 2
//Output: 5
//Example 2:

//Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//Output: 4




import java.util.PriorityQueue;

public class findkthLargestElement {
  class Solution {
    public int findKthLargest(int[] nums, int k) {
      //STEP 1: create Min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        //Step 2: Iterate through array
        for (int num: nums){
           minHeap.offer(num);
           //step -3: maintain size k
              if(minHeap.size() > k){
               minHeap.poll();  // Remove smallest element
              }
     

   
                
            }
            // step 4: Return answer (k-th largest)
          return minHeap.peek();  
        
    }
   
}
    
     

}
