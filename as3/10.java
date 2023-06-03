//10.WAP to calculate the sum of given series 2 4 6 8 10.....................n terms
import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to print the sum of given series 2 4 6 8 10.....................n terms");
      int n=sc.nextInt();
      System.out.println("***********The Sum is*************** ");
      int i=2,sum=0;
     while(i<=n)
    {  
       
       sum=sum+i;
       i=i+2;;

   }
    System.out.println("The Sum is:"+sum);
  }
}
