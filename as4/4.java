//4. WAP to calculate the sum of given series x^1 + x^2 + x ^3.........x^n
import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number to print the sum of given series x^1 + x^2 + x ^3.........x^n ");
       int n=sc.nextInt();

      float z,sum=0 ,fact=1,i=1;
      while(i<=n)
   {
     fact=fact*i;
     z=i/fact;
     sum=sum+z;
     i++;
   } 
 System.out.println(sum);
  }
}
