/*

1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1

*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
int j,i;
    
    for(i=1;i<=n;i++)
     {

       
        
         for(j=1;j<=2*i-1;j++)
        
               { 
               if(j%2==1) 
             System.out.print(i);
                 else
             System.out.print("*");
               }
            System.out.println();
       
       }
      
     for(i=n;i>=1;i--)
     

       
        {
         for(j=1;j<=2*i-1;j++)
        
               { 
               if(j%2==1) 
             System.out.print(i);
                 else
             System.out.print("*");
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

