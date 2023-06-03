/*Q.17 Find it there is any subarray with sum equals to zero
Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
Example 1:
Input:
5
4 2 -3 1 6

Output: 
Yes

Explanation: 
2, -3, 1 is the subarray 
with sum 0.*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
     int i,j,sum=0;
  
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
	   System.out.println("After sort the array is:");
	 for( i=0;i<=(n/2);i++)
                   {
                        if(x[i]==0)
                      break;
                         else 
  
                     sum=sum+x[i];
                   }
	
	           
           if(sum==0)
             System.out.println("yes");
           else
            System.out.println("No");
          
      }
    }
