/*Q.8 Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

Example 1:

Input :  N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }

Output : 
1  3  2  11  6  -1  -7  -5

Example 2:

Input :  N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}

Output :
7  9  10  11  -5  -3  -4  -1
*/




import java.util.Scanner;
class Main{
	public static void main(String args []){
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length :");
		
		int n = sc.nextInt();
		
		int x[] = new int[n]; 
		
		int i , j , k ;
		
		for( i = 0 ; i < n ; i++)
	  	{
	  	
	    		System.out.println("Enter the "+(i+1)+" Elements :");
	    		x[i]=sc.nextInt();
	    		
	  	}
	  	
	  	for(i = 0 ; i < x.length-1 ; i++)
	  	{
	  	
	  		if(x[i] < 0)
	  		{
	  		
	  			for(j = i+1 ; j < x.length ; j++)
	  			{
	  			
	  				if(x[j] > 0 )
	  				{
	  				
	  					for(k = j ; k > i ; k--)
	  					{
	  					
	  						int temp;
	  						
	  						temp = x[k];
	  						
	  						x[k] = x[k-1];
	  						
	  						x[k-1] = temp;
	  					
	  					}
	  				
					break;
	  				
	  				}

	  			}
	  		
	  		}

	  	}
	  	
	  	System.out.println("New Array :");
	  	
	  	for(int ele : x)
	  		System.out.print(" "+ele);
	  		
	  	System.out.println();	
	  		
	  }
	  
}
