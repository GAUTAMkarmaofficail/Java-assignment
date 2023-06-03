/*

3
44
555
6666
77777
6666
555
44
3

*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
int j,i,k=2;
    
    for(i=1;i<=n;i++)
     {

       k++;
        
         for(j=1;j<=2*i-1;j++)
        
               { 
               if(j%2==1) 
             System.out.print(k);
               
               }
            System.out.println();
       
       }
      
     for(i=n;i>1;i--)
     

       
        {k--;
         for(j=1;j<2*i-1;j++)
        
               { 

               if(j%2==1) 
             System.out.print(k);
                
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

