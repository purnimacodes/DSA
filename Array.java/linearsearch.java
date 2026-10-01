public class linearsearch {
    public static void main(String[] args) {
      int[] arr = {2, 3, 5, 7, 8, 13, 11, 17, 23, 29};
      int x = 29;
      boolean flag = false; //nahi mila
      for(int i=0; i<arr.length; i++) {
        if(arr[i] == x) {
          flag = true; //mil gaya
          break;
        }
      }
      if(flag==false)
        System.out.println("Nahi mila");
      else
        System.out.println("nahi mila");
    }
} 
