/*

    1
   232
  34543
 4567654
567898765


*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
     
 int i,j,k;
   for(i=1;i<=n;i++)
  {
    for(k=n;k>i;k--)
     System.out.print(" ");
    for(j=i,k=1;k<=2*i-1;k++)
 
    {
     if(k<=i) 
       {
       System.out.print(j);
       j++;
      
      if(k==i)
       j=2*i-1;
    
   }
      else
     {  
     --j;
     System.out.print(j);
     }
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

