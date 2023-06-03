/*
*         *
 *       * 
  *     *  
   *   *   
    * *    
     *     
    * *    
   *   *   
  *     *  
 *       * 
*         *
*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p25(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
     
int i,j;
   if(n%2==0) 
    n=n;
    else
    n=n-1;
    for(i=0;i<=n;i++){
         for(j=0;j<=n;j++)
          {         
            if( i==j || j == (n-i) )
             System.out.print("*");
            else
             System.out.print(" ");
          }
      System.out.println();
    }



  }
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 obj.p25();
 obj.p25();


  }

}

