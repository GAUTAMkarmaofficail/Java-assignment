//1. WAP to enter an integer number and check it is prime or not


import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number to check it is prime or not");
      int n=sc.nextInt();
    int i=2,r=0;
     while(i<=n){
      if(n%i==0)
      {
       r=n/i;
       break;
      }
      else
      i++;
     }
     if(r==1)
     System.out.println("prime");
     else
    System.out.println("not a prime"); 
   }
}
