/*Q.7 Sub array with given sum : - Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

Example 1:
Input: N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4

Explanation: The sum of elements from 2nd position to 4th position is 12.

Example 2:
Input: N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5

Explanation: The sum of elements from 1st position to 5th position is 15.

1 <= N <= 105
1 <= Ai <= 109
*/



import java.util.Scanner;
class Main{
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length :");
		
		int n = sc.nextInt();
		
		int x[] = new int[n]; 
		
		
		for(int i = 0 ; i < x.length ; i++)
		{
			
			System.out.println("Enter the "+(i+1)+" Elements :");
			x[i] = sc.nextInt();
		
		}


		System.out.println("Enter the Sum :");
		int sum = sc.nextInt();
		
		int i , j = 0 ;
		
		int s = 0 ;
		
		boolean flag = false ;
		
		for(i = 0 ; i < x.length-1 ; i++)
		{
			s = x[i];
			
			for(j = i+1 ; j < x.length ; j++)
			{
				s = s + x[i];
				
				if(sum == s)
				{
				
					flag = true;
					break;	
					
				}
				else
					if(s > sum)
					{
						break;
						
					}		
			
			if(flag)
				break;
				
			
			}
			

		}
		
		
		System.out.print((i-2)+" to "+(j));
		
		System.out.println();
		
		
	}
	
}
