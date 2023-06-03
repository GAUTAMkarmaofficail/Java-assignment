/*mul of two metric

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
       
        
System.out.println("Enter the order of 2 matric");
    int t=sc.nextInt();
    int h=sc.nextInt();
        int y[][]=new int[t][h]; 
      int z[][] = new int[m][n];
		
		

 for ( i = 0; i < t; i++)
       {   
          for ( j = 0; j < h; j++)
               y[i][j]=sc.nextInt();    
          
         } 

System.out.println("orignl");
for(i = 0 ; i < y.length ; i++)
		{
		
			for(j= 0 ; j < y[i].length ; j++)
			{

				z[i][j] = 0 ;

				for(int k = 0 ; k < m ; k++)
				{
			
					z[i][j] += x[i][k] * y[k][j];
			

				}
				
			
			
			}
			
		System.out.println();
System.out.println("After mul");
		
		}
for(i = 0 ; i < z.length ; i++)
		{
		
			for(j= 0 ; j < z.length ; j++)
			{
                         
                System.out.print(" "+z[i][j]);
                          }
            System.out.println();
               }

     
}

}

