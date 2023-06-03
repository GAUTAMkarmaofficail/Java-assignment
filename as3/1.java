//1. Program to print 10 times hello on output screen using loop


import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number how many time you want to print ");
   int n=sc.nextInt();
   int i=1;
while(i<=10)
{
  System.out.println("HELLO- " +i);
i++;
}

}
}

