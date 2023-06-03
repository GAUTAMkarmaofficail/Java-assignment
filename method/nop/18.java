/*
 1 0 0 0 1
 0 1 0 1 0
 0 0 1 0 0
 0 1 0 1 0
 1 0 0 0 1

*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
int j,i,k=1,c=0;
    
    for(i=1;i<=n;i++)
     {

       
        {
         for(j=1;j<=n;j++)
        
               { 
                  if(j==n+1-i||j==i)
             System.out.print(" "+k);
                 else
             System.out.print(" "+c);
               }
            System.out.println();
       
       }
      
     
    }
  }
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 obj.p7();

  }

}

