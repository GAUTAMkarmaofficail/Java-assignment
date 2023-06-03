/*28. P is one-dimensional array of integers. Write a Java program search for a data VAL from P. 
If VAL is present in the array then “element found ” otherwise “element not found” should be displayed.*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
     int i,j,sum=0;
  
  System.out.println("Enter array length");
   int n = sc.nextInt();
   
     int x[]= new int[n];
     
     for( i=0;i<n;i++)
	  {
	    System.out.println("Enter element Value");
	    x[i]=sc.nextInt();
	  }
System.out.println("Enter element for search");
	    int ele=sc.nextInt();

	  for( i=0;i<n;i++)
{
if(x[i]==ele)
 {System.out.println("Enter element found");
break;}
else
{
 System.out.println("Enter element not found");
break;}
 }}
}
