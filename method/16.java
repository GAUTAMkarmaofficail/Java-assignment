/*
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p16(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
     int i,j,k;

 for ( i =1; i <= n; i++)  
    {  
        for ( j = 1; j <= n- i; j++)  
        {  
            System.out.print("  ");   
        }  
       
        for ( k = 1; k <= ( 2 * i - 1); k++)  
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
 obj.p16();

  }

}

