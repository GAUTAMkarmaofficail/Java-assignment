/*

     1
    1 2
   1   3
  1     4
 1 2 3 4 5



*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
int i,j,k=5;;
    
    for(i=1;i<=n;i++){
         for(j=1;j<=n;j++)
          {         
            if(i+j>n+1||(i==2&&j==2)||(i==2&&j==3)||(i==3&&j==2))
             System.out.print(" ");
            
              
            
            else
             System.out.print(i+j-1);
          }
      System.out.println();
    }
  }
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 obj.p7();

  }

}

