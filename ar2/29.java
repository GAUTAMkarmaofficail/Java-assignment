/*29. Suppose a one-dimensional array AR containing integers is arranged in ascending order. 
Write a java program to search for an integer from AR with the help of Binary search method, */
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
     int i,j;
  
  System.out.println("Enter array length");
   int n = sc.nextInt();
   
     int x[]= new int[n];
     
     for( i=0;i<n;i++)
	  {
	    System.out.println("Enter element Value");
	    x[i]=sc.nextInt();
	  }
	 
	 for(  i=0;i<x.length-1; i++)
	{ 
	
	 for (j=i+1;j<x.length; j++)
	   {
	    if (x[i]> x[j])
	    {
	    x[i] = x[i] + x[j];
	    x[j] = x[i] - x[j];
	    x[i] = x[i] - x[j];
	    }
	    
	   }
	 }  
	   System.out.println("After assending the array is:");
	for( int e:x)
	 System.out.print(e+" ,");
	 
      }
    }
