//6 WAP to print the series 2 4 6 8 10..................n terms
import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to print the series 2 4 6 8 10..................n terms");
      int n=sc.nextInt();
      System.out.println("The numbers are__ ");
      int i=2;
     while(i<=n*2)
    {   System.out.println("\t");
        System.out.println(i);
        i=i+2;

   }

  }
}

