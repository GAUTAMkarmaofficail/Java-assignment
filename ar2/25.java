/*25. Write a Java program to reverse the element of an integer 1-D array. */
import java.util.Scanner;
class Main{
	public static void main(String args []){
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length :");
		
		int n = sc.nextInt();
		
		int x[] = new int[n]; 
		
		int i , j ;
		
		for(i = 0 ; i < x.length ; i++)
		{
			
			System.out.println("Enter the "+(i+1)+" Elements :");
			x[i] = sc.nextInt();
		
		}

		for(i = 0 , j = x.length-1 ; i < j ; i++ , j--)
		{
		
			int temp ;
			
			temp = x[i];
			
			x[i] = x[j];
			
			x[j] = temp;
		

		
		}
		
System.out.println("reverse array is");
		for(i = 0 ; i < n ; i++)
		{
			System.out.println(x[i]);
		}
	
	}

}
