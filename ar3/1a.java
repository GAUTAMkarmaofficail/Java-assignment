/*lower*/ 
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the order of matric");
    int m=sc.nextInt();
    int n=sc.nextInt();
        int x[][]=new int[m][n]; 
 
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[i].length; j++)
             x[i][j]=sc.nextInt();
      System.out.println("lower Matric after arrangement");
        for (int i = 0; i < m; i++)
           {  
              for (int j = 0; j < n; j++)
              {
               if(i>j)
               System.out.print("  "+x[i][j]);
               else
               System.out.print("  _");
              }
               System.out.println();
           }
    }
}

