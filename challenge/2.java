import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
   int j,k=0;
   System.out.println("Enter Total no of Element");
     int n=sc.nextInt();
     int  c[] = new int[n];
      
      
      
 //System.out.println("Enter Element");
       for(int i=0; i<n; i++)
         {  
            System.out.println("Enter "+(i+1)+" Element");
              c[i] = sc.nextInt();
          }    
              System.out.println("*************************************");  
                for(j=0; j<n; j++)
{
               {

              if(c[j]%2==0)
               { 
                 System.out.println("Even fount at index : " +j+ "  that is " +c[j]);
                 k++;
                 
                }
                
              if(c[j]%2==1)
              {
              System.out.println("Odd found at index : " +j+ "  that is " +c[j]);
               
               
                 
             }
}
             System.out.println("*************************************");  
             System.out.println("total even is: "+k+ "total odd is: "+(n-k));
     }
          /*
          for(j=1;j<=n;j++)
          {
              System.out.print(a[x] + " Even Found at Index " +a[x] );
              System.out.print(b[y] + " Even Found at Index " +b[y] );
          }            
         
   */
   
   
       
       }
    }
