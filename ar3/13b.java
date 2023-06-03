/*transpotation of two metric
                                                                                                                                                                                 
             
           }*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int sum=0,i,j,sum1=0;
  System.out.println("Enter the order of 1 matric");
    int m=sc.nextInt();
    int n=sc.nextInt();
        int x[][]=new int[m][n]; 

        for ( i = 0; i < x.length; i++)
            for ( j = 0; j < x[i].length; j++)
             x[i][j]=sc.nextInt();
       
        
//System.out.println("Enter the order of 2 matric");
  //  int t=sc.nextInt();
   // int h=sc.nextInt();
       // int y[][]=new int[t][h]; 
     // int z[][]=new int[3][3];
       // for ( i = 0; i < y.length; i++)
          //  for ( j = 0; j < y[i].length; j++)
           //  y[i][j]=sc.nextInt();
System.out.println("origninal");
 for ( i = 0; i < m; i++)
           {  
              for (j = 0; j < n; j++)
              {
            System.out.print(" "+x[i][j]);
              }
             System.out.println();
           }
System.out.println("after transpose");
      
        for ( i = 0; i < m; i++)
           {  
              for (j = 0; j < n; j++)
              {
            System.out.print(" "+x[j][i]);
              }
             System.out.println();
           }


     
}

}

