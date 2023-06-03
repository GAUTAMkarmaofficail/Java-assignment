/*
 1
 1 1
 1 2 1
 1 2 2 1
 1 2 2 2 1
*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
int j,i,k=1,c=2;
    
    for(i=1;i<=n;i++)
     {

       
        {
         for(j=1;j<=i;j++)
        
               { 
                if(j==1||j==i)
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

