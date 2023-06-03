/*10.Write a program to cyclically rotate array by one.*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
     int i,j,x;
 /******************************************/ 
  System.out.println("Enter array 1 length");
   int n = sc.nextInt();
   
     int a[]= new int[n];
 
       for( i=0;i<n;i++)
	  {
	   System.out.println("Enter element of ar 1  Value");
	    a[i]=sc.nextInt();
	  }
       x=a[n-1];
         for( i=n-1;i>0;i--)
     {
     a[i]=a[i-1];
     }
     a[0]=x;
 System.out.print("After one time rotation value is ");
 for( i=0;i<n;i++)
	  {
	    System.out.print(" "+a[i]+", ");
	   
	  }
 System.out.println();
   }
}

