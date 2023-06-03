/* 21. Java program to check whether the triangle is valid or not if angles are given.
 Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180.
*/
import java.util.Scanner;
 class Main{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter first angle");
	 int a=sc.nextInt();

	 System.out.println("Enter the second angle");
	 	 int b=sc.nextInt();
	 
System.out.println("Enter the third angle");

int c=sc.nextInt();
if((a+b+c)==180)

System.out.println("it is triangle");
else
System.out.println("it is not valid triangle");

	}
}
