/*24. Write a Java program to swap first and last element of an integer 1-d array.*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
     int i,j,size;
 /******************************************/ 
  System.out.println("Enter array 1 length");
   int n = sc.nextInt();
   
     int x[]= new int[n];
 
       for( i=0;i<n;i++)
	  {
	   System.out.println("Enter element of ar 1  Value");
	    x[i]=sc.nextInt();
	  }
         size=x.length;
{
         int temp=x[0];
         x[0]=x[size-1];
           x[size-1]=temp;
    }
     System.out.print("After swap value is ");
             for( i=0;i<n;i++)
	  {
	    System.out.print(" "+x[i]+", ");
	   
	  }
    System.out.println();
   }
}

