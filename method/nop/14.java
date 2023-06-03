/*

*
*1*
*121*
*12321*
*1234321*
*12321*
*121*
*1*
*

*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
 int i,j,k=1,l=0;
    System.out.println("*");
    for(i=1;i<n;i++)
      {  
        
            System.out.print("*");
            	
        for(j=1,k=1;k<=2*i-1;k++)
          {
             
             
              if(k<=i)
                 {
                   System.out.print(j);
                   j++;
               
           
             if(k==i)
              j=i;
           }
         else
           {
            --j;
            System.out.print(j);
           }
       } 
           System.out.print("*");
            System.out.println();
       }
       
     
    for(i=n-2;i>=1;i--)
      {  
        
            System.out.print("*");
        for(j=1,k=1;k<=2*i-1;k++)
          {
              
              if(k<=i)
                 {
                   System.out.print(j);
                   j++;
               
           
             if(k==i)
              j=i;
           }
         else
           {
            --j;
            System.out.print(j);
           }
       } 
           System.out.print("*");
            System.out.println();
       }   
         System.out.println("*");
     
  }
}
class Main{
 public static void main(String args[]){
 Operation obj=new Operation();
 obj.p7();

  }

}

