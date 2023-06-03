/*32. Given two arrays of integers A and B of sizes M and N respectively. Write a Write a java program, which will produce a third array named C. such that the following sequence is followed. 
All even numbers of A from left to right are copied into C from left to right. 
All odd numbers of A from left to right are copied into C from right to left. 
All even numbers of B from left to right are copied into C from left to right. 
All old numbers of B from left to right are copied into C from right to left.
e.g., A is {3, 2, 1, 7, 6, 3} and B is {9, 3, 5, 6, 2, 8, 10} the resultant array C is {2, 6, 6, 2, 8, 10, 5, 3, 9, 3, 7, 1, 3} */
import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array length");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,k=0,j;
		
		for(i=0;i<n;i++){
			System.out.println("Enter an element ..");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter 2nd Array length");
		int n1=sc.nextInt();
		int b[]=new int[n1];
		
		for(i=0;i<n1;i++){
			System.out.println("Enter an element ..");
			b[i]=sc.nextInt();
		}
		
		int c[]=new int[a.length+b.length];
		int l=c.length-1;
		for(i=0;i<n;i++){
			if(a[i]%2==0)
				c[k++]=a[i];
			else
				c[l--]=a[i];
		}
		
		for(i=0;i<n1;i++){
			if(b[i]%2==0)
				c[k++]=b[i];
			else
				c[l--]=b[i];
		}
		for(int z:c)
			System.out.print(z+" ");
	}
}
