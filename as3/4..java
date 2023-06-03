//4. WAP to print the series 1 2 3 4 5 ...................n


import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to print the series 1 2 3 4 5 ...................n ");
      int n=sc.nextInt();
      System.out.println("The numbers are__ ");
      int i=1;
     while(i<=n)
    {   System.out.println("\t");
        System.out.println(i);
        i++;
   }

  }
}

