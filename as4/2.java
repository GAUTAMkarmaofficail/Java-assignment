//2. WAP to calculate x^y (x to the power y)
import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number to calculate x^y ");
       int x=sc.nextInt();
      System.out.println("Enter a number to calculate x^y ");
       int y=sc.nextInt();
    int i=1,z=1;
     while(i<=y)
   { 
   z=z*x;
 
   i++;
  

   }
    System.out.println(z);

    
  }
}
