/*
**********
 *        *
  *        *
   *        *
    *        *
     *        *
      *        *
       *        *
        *        *
         **********
*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p6(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
     
int i,j,k;
    
    for(i=1;i<=n;i++)
         {
             
         for(k=1;k<i;k++){
          System.out.print(" ");
         }
          for(j=n;j>=1;j--)
          { 
            if(i==1||j==1||i==n||j==n)         
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
 obj.p6();


  }

}

