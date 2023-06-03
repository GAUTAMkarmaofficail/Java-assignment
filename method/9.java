/*
* 
* * 
*   * 
*     * 
*       * 
*         * 
*           * 
*             * 
*               * 
* * * * * * * * * * 

*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p9(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
     
int i,j;
    
    for(i=1;i<=n;i++){
         for(j=1;j<=i;j++)
             {
             if(i==n||j==1||i==j)
             System.out.print("* ");
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
 obj.p9();

  }

}

