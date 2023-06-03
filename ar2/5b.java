
/*Q.5b Find occurance of an integer number in array.
Find occurance of an integer number in array.
*/
import java.util.Scanner;

class Main {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter length of array");
      int n = sc.nextInt();
      int x[] = new int[n];

      int i, j, c = 1;
      for (i = 0; i < n; i++) {
         System.out.println("enter elements");
         x[i] = sc.nextInt();
      }
      for (i = 1; i < n - 1; i++) {
         c = 1;
         for (j = i + 1; j < n; j++) {

            if (x[i] == x[j])
               c++;
         }

         {
            System.out.println(x[i] + "  occurance  " + (c) + "  times");
         }
      }
   }
}

/*
 * import java.util.Scanner;
 * class Main{
 * public static void main(String args[]){
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter range of Array");
 * int n= sc.nextInt();
 * int x[]=new int[n];
 * 
 * int i,j,c=1;
 * for(i=1;i<n;i++)
 * {
 * System.out.println("Enter " +i+ "  element");
 * x[i] = sc.nextInt();
 * }
 * 
 * for(i=0;i<n-1;i++)
 * {
 * for(j=i+1;j<n;j++)
 * {
 * c=1;
 * if(x[i]==x[j])
 * {
 * c++;
 * }
 * if(c!=1)
 * {
 * 
 * System.out.println(x[i]+" occurance " +c+ " time");
 * break;
 * 
 * }
 * }
 * }
 * 
 * 
 * 
 * }
 * 
 * }
 */
