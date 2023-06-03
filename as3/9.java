//9. WAP to calculate the sum of given series 1 2 3 4 5 6 7 ................n terms

import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to print the sum of given series 1 2 3 4 5 6 7 ................n terms");
      int n=sc.nextInt();
      System.out.println("***********The Sum is*************** ");
      int i=1,sum=0;
     while(i<=n)
    {  
       
       sum=sum+i;
       i++;

   }
    System.out.println("The Sum is:"+sum);
  }
}

