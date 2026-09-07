public class maxValuePrint {
   public static void main(String[] args) {
    int[] arr = {30, 50, 20, 45, 87, 90, 2, 43};
    int max =arr[0];
    for(int i=0; i<arr.length; i++) {
      if(arr[i]> max){
        max= arr[i];
        System.out.println("max value is:" +max);

      }
    }
   }
}
