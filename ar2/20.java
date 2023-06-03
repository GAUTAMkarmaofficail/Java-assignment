/*Q.20 Longest consecutive sequence.
Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
import java.util.Arrays;

 */
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
	  // System.out.println("After sort the array is:");
    int co=0;
   for(  i=0;i<x.length-1; i++)
           for (j=i+1;j<x.length; j++)
           {
            if(x[i]+1==x[j])
             co++;
           // else
           //  break;
	 
	   }
             System.out.println(co);
      }
    }
