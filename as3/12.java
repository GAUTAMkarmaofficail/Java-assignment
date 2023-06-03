//12.WAP to program to calculate the factorial of any given number.
import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to print the factorial of any given number.");
      int n=sc.nextInt();
      System.out.println("***********The factorial is*************** ");
      int j=1;
      
     while(n>0)
    {  
    j=j*n;
    n--;
    
    
   }
    System.out.println("The factorial is:"+j);
  }
}
