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
    *                 * 
  *                   * 
* * * * * * * * * * * *


*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p10(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
     
int i,j;
    
    for(i=0;i<=n;i++){
         for(j=0;j<=n;j++)
          {         
            if( i == n || j == n  || j == (n-i))
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
 obj.p10();

  }

}

