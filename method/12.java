/*

* * * * * * * * * * 
*               * 
*             * 
*           * 
*         * 
*       * 
*     * 
*   * 
* * 
* 


*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p12(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
     
int i,j;
    
    for(i=1;i<=n;i++){
         for(j=1;j<=n;j++)
          {         
            if(i==1 || j==1   || j == (n+1-i))
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
 obj.p12();

  }

}

