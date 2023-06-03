/*4.

           1
         2 3 2
       3 4 5 4 3
     4 5 6 7 6 5 4 
   5 6 7 8 9 8 7 6 5 
 
*/
class Main {
  public static void main(String args[]) {

    int i, j, k;
    for (i = 1; i <= 5; i++) {
      for (k = 5; k > i; k--)
        System.out.print(" ");
      for (j = i, k = 1; k <= 2 * i - 1; k++)

      {
        if (k <= i) {
          System.out.print(j);
          j++;

          if (k == i)
            j = 2 * i - 1;

        } else {
          --j;
          System.out.print(j);
        }
      }
      System.out.println();

    }
  }
}
