//2.Program to print 1 to 10 number using loop


import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number how many time you want to print ");
      int n=sc.nextInt();
      System.out.println("The numbers are__ ");
      int i=1;
     while(i<=10)
    {   System.out.println("\t");
        System.out.println(i);
        i++;
   }

  }
}

