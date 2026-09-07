// public class marks {
//    public static void main (String[] args){
//     int[] marks = {100, 95, 85, 21, 17, 71, 36, 35, 7};
//     for(int i=0; i<marks.length;i++){
//       if(marks[i]<35)
//         System.out.println(i+" ");
//     }
//    }
// }
// yeha per question bol raha tha jis bacche ka number kaam aaya hai 35 se kam no. aya uska index jisko roll no. bola gaya question mai usko print karo output mai hai 3,4,8 iska matalab hai index per 3, 4, 8, wale student ka no. kaam aya hai 



//Q1. calculate the sum of all the elements in the giveen array.

import java.util.Scanner;

public class marks {
  // public  static void main (String[] args){
  //   int[] marks ={100, 29, 24,21,17};
  //   int sum = 0;
  //   for(int i=0; i<marks.length; i++){
  //     sum = sum + marks[i];
  //   }
  //   System.out.println("Sum of all elements: " + sum);
  // }

  //condition 2 solving take input
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Array Size:");
     int n = sc.nextInt();
     int[] arr = new int[n];
     int sum = 0;
     for(int i =0; i<n; i++) {
      arr[i] = sc.nextInt();
      sum = sum + arr[i];
     }
     System.out.println("Sum of all elements: " + sum);
  }
}