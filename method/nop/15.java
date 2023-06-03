/*

 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1
*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
int j,i,k=0,c=1;
    
    for(i=1;i<=n;i++)
     {

       
        {
         for(j=1;j<=i;j++)
        
               { 
                if((i+j)%2==0)
             System.out.print(" "+c);
                 else
             System.out.print(" "+k);
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

