//11 WAP to calculate the sum of given series 1 - 2 + 3 - 4 + 5 - 6................n terms


import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to sum of given series 1 - 2 + 3 - 4 + 5 - 6................n terms");
      int n=sc.nextInt();
    
     
      int sum=0;
      while(n>=1)
      { 
       if(n%2==0)
       sum=sum-n;
      else
      sum=sum+n;
       n--;
      }
System.out.println(sum);
}
}
