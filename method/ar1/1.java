/*
1. Write a java program to find out all palindrom number in
array.

*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
  public void p7(){

    
 
     
  int i,j;
   System.out.println("Enter Total no of Element");
     int n=sc.nextInt();
     int  arr[] = new int[n];
      
      
      

       for(i=0; i<n; i++)
         {  
            System.out.println("Enter "+(i+1)+" Element");
              arr[i] = sc.nextInt();
          } 
          System.out.println("given data is:");   
         
         {  
           for(i=0; i<n; i++)
             //System.out.println(+arr[i]+"is"+i);  
while(i<n)
   { 
   int t=arr[i],rem=0,rev=0;
   
    while(t!=0)
     { 
      rem=t%10;
      rev=rev*10+rem;
      t=t/10;
      }
   if(arr[i]==rev)
   System.out.println("palindrom is "+rev+" at index "+(i+1));
  i++;
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

