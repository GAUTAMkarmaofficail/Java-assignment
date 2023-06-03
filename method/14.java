/*

* * * * * * * * * * 
  * * * * * * * * * 
    * * * * * * * * 
      * * * * * * * 
        * * * * * * 
          * * * * * 
            * * * * 
              * * * 
                * * 
                  * 

*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p8(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
     
int i,j;
    
    for(i=10;i>=1;i--){
         for(j=1;j<=10;j++)
          {         
            if(j<=10-i)
             System.out.print("  ");
            else
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

