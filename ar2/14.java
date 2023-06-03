/*14.Find the first non-repeating element in given array of integers
Find the first non-repeating element in a given array arr of N integers.*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
     int i,j,x=0,co=0;
    
 /******************************************/ 
  System.out.println("Enter array 1 length");
   int n = sc.nextInt();
   
     int a[]= new int[n];
    
     //int count[]= new int[a.length];
     //m=0;    
     for( i=0;i<a.length;i++)
	  {
	    System.out.println("Enter element of ar 1  Value");
	    a[i]=sc.nextInt();
	  }

     for( i=1;i<a.length;i++) 
         { 
     x =a[i];
           co=0;
             
        for( j=0;j<a.length;j++) 
            {
               if(a[j]==x&&i!=j)
                  
                     co++;
              
               
                    
             
            }  
          
          
        }     if(j==a.length)
            System.out.println("the element  " +a[i]+ " is not repeated ");


  }
}
