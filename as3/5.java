//5.WAP to print the series 1 3 5 7 9....................n terms


import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to print the series 1 3 5 7 9....................n terms");
      int n=sc.nextInt();
      System.out.println("The numbers are__ ");
      int i=1;
     while(i<=n*2)
    {   System.out.println("\t");
        System.out.println(i);
        i=i+2;

   }

  }
}

