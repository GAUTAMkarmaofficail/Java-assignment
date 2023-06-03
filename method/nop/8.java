
/*

1
121
12321
1234321
123454321

*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    System.out.println("Enter A number");
   int n=sc.nextInt();
 
   int i,j,k;

   for(i=65;i<=65+n;i++)
  {
    
    for(k=65;k<i;k++)
 
    System.out.print((char)k);
      for(j=i;j>=65;j--)
 
    System.out.print((char)j);
   
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



