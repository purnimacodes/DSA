//platform GFG
//Q1.MIN and max in array
// input: arr[]=[1,4,3,5,8,6]
//output:[1,8]
//Explanation:minimum and maximum element of array are 1 and 8.

import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        
          
            int min = arr[0];
            int max = arr[0];
            for(int i=1; i<arr.length; i++){
               
                    if(arr[i] < min){
                        min = arr[i];
                    }
                    if(arr[i] > max){
                        max = arr[i];
                   
                }
            }
    
            ArrayList<Integer>result = new ArrayList<>();
            result.add(min);
            result.add(max);
    
          return result;
    
    
        }
          
}    




