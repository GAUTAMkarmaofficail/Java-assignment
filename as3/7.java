//7 WAP to print the series 1 4 9 16 25................n terms 
import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to print the series 2 4 6 8 10..................n terms");
      int n=sc.nextInt();
      System.out.println("***********The Square series is__\t*************** ");
      int i=2;
     while(i<=n)
    {  
        System.out.println(i+" square is "+(i*i));
        i++;

   }

  }
}

