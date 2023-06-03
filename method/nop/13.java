/*
1
2*3
4*5*6
7*8*9*10
7*8*9*10
4*5*6
2*3
1


*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
int j,i,k=1,seq;
    
    for(i=1;i<=n;i++)
     {
         for(j=1;j<=2*i-1;j++)
        
             { 
               if(j%2==0) 
               System.out.print("*");
                 else
                System.out.print(k++);
             }
            System.out.println();
    }
         k=k-i+1;
    for(j=1;j<=2*n-1;j++)
         { 
          if(j%2==0) 
           System.out.print("*");
             else
           System.out.print(k++);
        
         }
        System.out.println();
        seq=2*n-1;
        for(i=1;i<=n;i++)
     {

       k=k-seq;
        
         for(j=1;j<=2*(n-i)-1;j++)
        
               { 
               if(j%2==0) 
               System.out.print("*");
                 else
             
             System.out.print(k++);
               }
    
           System.out.println();
          seq=seq-2;
       
       
       
       }
     
  }
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 obj.p7();

  }

}

