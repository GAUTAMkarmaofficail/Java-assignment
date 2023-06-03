/*10.Calculate the sum of following serires
   1/x + 1/x^2 + 1/x^3......1/x^n 
    
*/
import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a the value of x");
      int x=sc.nextInt();
      System.out.println("Enter a the value of n");
      int n=sc.nextInt();
     
    float i=1,sum=0,z1=1,z=1;;
     while(i<=n)
   { 
 
   z=z*x;
   z1=1/z;
   sum=sum+z1;
   i++;
   }
    System.out.println(sum);

 }
}
