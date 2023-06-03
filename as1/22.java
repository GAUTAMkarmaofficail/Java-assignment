//22. Write a Java program to check whether a number is divisible by 5 and 11 or not. 

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");
   int num1=sc.nextInt();
   
if(num1/5==0&&num1/11==0){
System.out.println("The number is divisible by 5&11 :::"+num1);
}
else
{
 System.out.println("The given number  is not divisible by 5&11:::"+num1);
  }
}
}
