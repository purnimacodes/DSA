public class reverseArray {
  public static void print(int [] arr)
  {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
   public static void swap(int[] arr, int i, int j) {}
   public static void main(String[] args) {
    int [] arr = {2, 3, 5, 7, 9, 11, 13, 17};
    print(arr);
    int i=0, j = n-1;
    while(i<j) {
      swap(arr, i, j);
      i++;
      j--;
    } 
    print(arr);
   }
}
