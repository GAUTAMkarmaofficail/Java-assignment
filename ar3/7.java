/*7


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
      System.out.println("After sort");
        for ( i = 0; i < m; i++)
           {  
             
		for(j=0;j<n;j++)
                      
		{
		temp=x[i][j];
                
			

		
		}
      
           }
          System.out.println();
          
               
    
    }

}
*/
import java.util.Scanner;
class Main{
        public static void main(String args[]){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter row and coumn");
             int n=sc.nextInt();
             int m=sc.nextInt();
             int a[][]=new int[n][m];
             int  r,c,temp=0;
             for(r=0;r<n;r++){
                 System.out.println("Enter " +r+ "row data");
                 for(c=0;c<m;c++){
                     a[r][c]=sc.nextInt();
                 }
             }
             for(r=0;r<n;r++){
                   for(c=0;c<m-1;c++){
                    
                        if(a[r][c]>a[r][c+1]){
                            temp=a[r][c];
                            a[r][c]=a[r][c+1];
                            a[r][c+1]=temp;
                        }
                      }
                        if(a[r][0]>a[r][1]){
                          temp = a[r][0];
                          a[r][0]=a[r][1];
                          a[r][1]=temp;
                          }
                      
                             
                   
             }
              System.out.println("reverse array element are");
             for(r=0;r<n;r++){
                  for(c=0;c<m;c++){
                       System.out.print(a[r][c]+ "  ");
                  }
                  System.out.println();
                  
             }
             System.out.println();
             
             
        }
}
