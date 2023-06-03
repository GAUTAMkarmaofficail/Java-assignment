/*
******
 *****
  ****
   ***
    **
     *
    **
   ***
  ****
 *****
******

*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p16(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
     

int i,j,col=0;  
     if(n%2==1)
      col=n/2+1;
     else
      col=n/2;

       for(i=1;i<=n;i++)
     {
         for(j=1;j<=col;j++)
           if(j>=i||i+j>n)
         System.out.print("*");
         else
         System.out.print(" ");
          
        
     System.out.println();
    }  
  }
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 obj.p16();

  }

}

