/*

     1
    1 2
   1   3
  1     4
 1 2 3 4 5



*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
int i,j,k;
    
    for(i=1;i<=n;i++){

    for(k=n;k>i;k--)
       System.out.print(" ");
    for(j=1;j<=i;j++)
     {
     if(i==n||i==j||j==1)
       System.out.print(" "+j);
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
 obj.p7();

  }

}

