/*10*/


import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
 int sum=0,i,j;
  System.out.println("Enter the order of matric");
    int m=sc.nextInt();
    int n=sc.nextInt();
        int x[][]=new int[m][n]; 
 
        for ( i = 0; i < x.length; i++)
            for ( j = 0; j < x[i].length; j++)
             x[i][j]=sc.nextInt();
      System.out.println("sum ");
        for ( i = 0; i < m; i++)
           {  
              for (j = 0; j < n; j++)
              {
             if(i==1&&)
              System.out.print(" "+x[i][j]);
            
          
            
              }
               System.out.println();
           }

               
    
    }

}

