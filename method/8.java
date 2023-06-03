/*
                  * 
                * * 
              * * * 
            * * * * 
          * * * * * 
        * * * * * * 
      * * * * * * * 
    * * * * * * * * 
  * * * * * * * * * 
* * * * * * * * * * 


*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p8(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
     
int j,i,k;
    
    for(i=1;i<=n;i++)
       {
         for(k=n;k>i;k--)
         {
          System.out.print("  ");
         }
         for(j=1;j<=i;j++)
         {
          System.out.print("* ");
         }
      
        System.out.println();
      }

  }
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 obj.p8();

  }

}

