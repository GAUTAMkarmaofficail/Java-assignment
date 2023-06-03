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
 
     int i,j,sp;
     for(i=1;i<=n;i++)
  {
    for(sp=n;sp>i;sp--)
    System.out.print(" ");
     for(j=1;j<=2*i-1;j++)
      System.out.print("*");
      System.out.println();


  }
     for(i=1;i<=n;i++)
  {
    for(sp=n;sp>i;sp--)
    System.out.print(" ");
     for(j=1;j<=2*i-1;j++)
     System.out.print("*");
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

