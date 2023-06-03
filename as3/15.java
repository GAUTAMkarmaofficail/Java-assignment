//15. WAP to to input 3 digit number and check it is armstron or not


import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter 3 digit number and check it is armstron or not");
      int n=sc.nextInt();
    
      int rev=0,rem=0,temp;
      temp=n;
      while(n!=0)
     { 
      rem=n%10;
      rev=rev+rem*rem*rem;
      n=n/10;
      }
if(temp==rev) 
System.out.println("armstron"); 
else
System.out.println("not armstron"); 
 
}
}
