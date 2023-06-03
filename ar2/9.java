/*Q.9 Find the Intersaction of two sorted array.

Given two arrays a[] and b[] of size n and m respectively. 

The task is to find intersaction between these two arrays. 

Intersaction of the two arrays can be defined as the set is containing only common distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.

Example 1:

Input:

1 2 3 4 5
1 2 3 6 7

Output: 
3

Explanation: 
1, 2, 3 are the elements which comes in the intersaction set of both arrays So count is 3.

Example 2:

Input:
 
85 25 1 32 54 6
85 32 2 18 78 

Output: 
2

Explanation: 
85, 32 are the elements which comes in the intersaction set of both arrays So count is 2.
*/


import java.util.Scanner;
class Test{
	public static void main(String args []){
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length of 1st Array :");
		
		int n = sc.nextInt();
		
		int a[] = new int[n]; 
		
		
		for(int i = 0 ; i < a.length ; i++)
		{
			
			System.out.println("Enter the "+(i+1)+" Elements :");
			a[i] = sc.nextInt();
		
		}

		
		System.out.println("Enter the Length of 2nd Array :");
		
		int m = sc.nextInt();
		
		int b[] = new int[m]; 
		
		
		for(int i = 0 ; i < b.length ; i++)
		{
			
			System.out.println("Enter the "+(i+1)+" Elements :");
			b[i] = sc.nextInt();
		
		}
		
		
		int inter[] = new int[n + m];                                                                                                        
		
		
		
		int i , j ;
		
		
		
		for(i = 0 ; i < a.length-1 ; i++)
		{

		
			for(j = 0 ; j < a.length ; j++)
			{
			
				if(a[i] == b[i])
					break;	

			}
		
		
		
		

		}
		
		
		
		
		
		System.out.println();
		
		
	}
		
		
		
}
