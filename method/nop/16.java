/*
 2
 3 5
 7 11 13
 17 19 23 29

*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    System.out.println("Enter A number");
   int t=sc.nextInt();
  int i,k,j,n=2,pc=0; 
    
    for(i=1;i<=t;i++)
     
          {  
               pc=0;
             while(true)
               {  
                  k=2; 
                while(i<=(n/2)) 
                  {
                     if(n%k==0)
                        
                     break;
                         
                    k++;
                    
                 }
          	 
                  if(k>n/2) {
                      System.out.print(" "+n);     
                    
                   pc++;  }  
             
              n++;
               if(pc==i)
               
               break;
              
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

