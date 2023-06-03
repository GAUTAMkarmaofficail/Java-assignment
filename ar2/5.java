
/*Q.5 Find the kth largest and kth smallest element in array.
*/
import java.util.Scanner;

class Main {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      int i, j;
      System.out.println("Enter Total no of Element");
      int n = sc.nextInt();
      int x[] = new int[n];

      for (i = 0; i < n; i++) {
         System.out.println("Enter  " + (i + 1) + "  Element");
         x[i] = sc.nextInt();
      }
      System.out.println("Enter kth");
      int k = sc.nextInt();

      for (i = 0; i < n; i++) {
         for (j = i + 1; j < (n); j++)
            if (x[i] < x[j]) {

               int temp = x[i];
               x[i] = x[j];
               x[j] = temp;
            }
         if (i == k - 1) {
            System.out.println(k + " largest is :" + x[i - 1]);
            break;

         }

      }
      for (i = 0; i < n; i++) {
         for (j = i + 1; j < (n); j++)
            if (x[i] > x[j]) {

               int temp = x[i];
               x[i] = x[j];
               x[j] = temp;
            }
         if (i == k - 1) {
            System.out.println(k + " Smallest is :" + x[i]);
            break;

         }
      }
   }
}
