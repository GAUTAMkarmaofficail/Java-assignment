//  Q.6 Sort the array of 0s , 1s and 2s.

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
	    int y = sc.nextInt();
	    
	    if(y<3){
	    x[i]=y;
	    }
	    else{
	     System.out.println("Enter element no b/w 0-2");
	     i--;
	     }
	  }
	 
	 for(  i=0;i<x.length-1; i++)
	{ 
	
	 for (j=i+1;j<x.length; j++)
	   {
	    if (x[i]> x[j])
	    {
	    x[i] = x[i] + x[j] - ( x[j] = x[i]);
	  
	    }
	    
	   }
	 }  
	   System.out.println();
	for( int e:x)
	 System.out.println(e);
	 
      }
    }
