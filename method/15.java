/*
int i,j;
    
    for(i=1;i<=10;i++){
         for(j=1;j<=10;j++)
          {         
            if(i==1  || j == 10 || i==j )
             System.out.print("*");
            else
             System.out.print(" ");
          }
      System.out.println();
    }

 * * * * * * * * * *
 *                 *
 *                 *
 *                 *
 *                 *
 *                 *
 *                 *
 *                 *
 *                 *
 * * * * * * * * * *


*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p15(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
     
int i,j;
    
    for(i=1;i<=n;i++){
         for(j=1;j<=n;j++)
             {
             if(i==1||j==1||j==n||i==n)

             System.out.print(" *");
             else
             System.out.print("  ");

             }
      System.out.println();
    }
  


  }
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 obj.p15();

  }

}

