//3. WAP to calculate the sum of given series x^1 + x^2 + x ^3.........x^n 
import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number x ");
       int x=sc.nextInt();
       System.out.println("Enter a number n ");
       int n=sc.nextInt();
       int i=1,z=1,sum=0;
   
     while(i<=n)
   { 

    z=z*x;
    sum=sum+z;
    i++;
   }
    System.out.println(sum);

    
  }
}
