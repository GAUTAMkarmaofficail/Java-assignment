//14.WAP to input a number and check it palindrome or not

import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to check it palindrome or not");
      int n=sc.nextInt();
      int rem=0,rev=0,ori=0; 
      ori=n;
      
      while(n!=0)
     { 
      rem=n%10;
      rev=rev*10+rem;
      n=n/10;
      }
if(ori==rev)
System.out.println("palindrome");  
else
System.out.println("not palindrome"); 
}
}
