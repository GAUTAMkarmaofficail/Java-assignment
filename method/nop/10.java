/*

********1*******
*******2*2******
******3*3*3*****
*****4*4*4*4****
****5*5*5*5*5***

*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
     
int j,i,k;
    
    for(i=1;i<=n;i++)
     {
        for(k=1;k<=(n+4)-i;k++)
          System.out.print("*");
        
        for(j=1;j<=i;j++)
          System.out.print(i+"*");
        for(k=1;k<=(n+2)-i;k++)
          System.out.print("*");
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

