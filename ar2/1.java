/**Q.1 Peak an element : - An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).

Given an array arr[] of size N, find the index of any one of its peak elements.

Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

Example 1:
Input: N = 3
arr[] = {1,2,3}
Output: 1

Explanation: 3 (at index 2) is the peak element as it is greater than its neighbour element 2.

Example 2:
Input: N = 2
arr[] = {3,4}
Output: 1

Explanation: 4 (at index 1) is the peak element as it is greater than its only neighbour element 3.

Constraints:
1 ≤ N ≤ 105
1 ≤ A[] ≤ 106
*/


import java.util.Scanner;
class Test{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		int i ;
		
		for(i = 0 ; i < arr.length ; i++)
		{
			
			System.out.println("Enter the "+(i+1)+" Elements :");
			arr[i] = sc.nextInt();
		
		}
		
		System.out.println("The Index is :");
		
		if(n==1)
                     {
          		
          		
        	if(n==2)
        	{
        	
         		if(arr[0] >= arr[1])
         		{
            			System.out.println("0");
            		}
            		else
            		{
          			System.out.println("1");
          		}
          		
        	}    
        	else
        	{
          		if(arr[0] >= arr[1])
          		{
            			System.out.println("0");
            			
            		}	
          		if(arr[arr.length-1] > arr[arr.length-2]) 
            			System.out.println(n-1);
          
          
          		for(i=1; i <= arr.length-2 ; i++){
              			if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1])
                			System.out.println(i);
          		}    
          		
          		
        	} 
        	}
else
       	System.out.println("0");


	} 
	
}
