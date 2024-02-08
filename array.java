// JAVA PROGRAM FOR ADDING AN ARRAY


public class Example {
   public static void main(String[] args) { 

     int[] arr = {-5, 1, 3, 8, 4};
     System.out.println("Array:");
     printArray(arr);

     int sum = calculateSum(arr);
     System.out.println("\nSum: " + sum);
    }

   public static int calculateSum(int[] arr) {
     int sum = 0;
     for (int value : arr) {
         sum += value;
     }
     return sum;
   }

   public static void printArray(int[] arr) {
     for (int value : arr) {
         System.out.print(value + " ");
     }
   }
}