/*Q.9b Find the Union of two sorted array.

Given two arrays a[] and b[] of size n and m respectively. 

The task is to find union between these two arrays. 

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.

Example 1:

Input:

1 2 3 4 5
1 2 3

Output: 
5

Explanation: 
1, 2, 3, 4 and 5 are the elements which comes in the union set of both arrays So count is 5.

Example 2:

Input:

85 25 1 32 54 6
85 27 13 32

Output: 
8

Explanation: 
85, 25, 1, 32, 54, 6, 27 and 13 are the elements which comes in the union set of both arrays So count is 8.
*/


import java.util.Scanner;
class Test{
	public static void main(String args []){
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length of 1st Array :");
		
		int n = sc.nextInt();
		
		int x[] = new int[n]; 
		
		
		for(int i = 0 ; i < x.length ; i++)
		{
			
			System.out.println("Enter the "+(i+1)+" Elements :");
			x[i] = sc.nextInt();
		
		}
		
		
		
		
		System.out.println("Enter the Length of 2nd Array :");
		
		int m = sc.nextInt();
		
		int y[] = new int[m]; 
		
		
		for(int j = 0 ; j < x.length ; j++)
		{
			
			System.out.println("Enter the "+(j+1)+" Elements :");
			y[j] = sc.nextInt();
		
		}
		
		
		int union[] = new int[x.length + y.length];
		
		int k = 0 , ele ;
		
		union[k++] = x[0];
		
		int i , j ;
		
		
		for(i = 1 ; i < x.length ; i++)
		{
			
			ele = x[i];
			
			for(j = 0 ; j < k ; j++)
			{
			
				if(ele == union[j])
					break;
	
			}
		
		
		if(j == k)
			union[k++] = ele;
		

		}
		
		
		System.out.print("Union is :"+union[k]);
		
		
		System.out.println();
		
		
	}
		
		
		
}
