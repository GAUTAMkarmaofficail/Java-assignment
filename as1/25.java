//25. Write a Java program to calculate profit or loss. 

import java.util.Scanner;
 class Main{
	public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enterthe cost price");
	 int c=sc.nextInt();

	 System.out.println("Enter the selling price");
	 	 int s=sc.nextInt();
	 int p=s-c;

if(s>c)
System.out.println("it is profit of Rs:"+p);
else
System.out.println("it is loss of Rs:"+p);


	}
}
