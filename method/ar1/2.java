/*2. Write java program to replace each array element 
   with it factorail value

*/
import java.util.Scanner;
class Operation{
Scanner sc=new Scanner(System.in);
   public void p1(){

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
   int t=arr[i],rem=0,rev=1;
   
    while(t!=0)
     {
       
      
      rev=rev*t;
      t--;
      }
   
   System.out.println("factorial  of "+arr[i]+ "is" +rev+" at position "+(i+1));
  i++;
  }  
          }    

   }
}
class Main{
 public static void main(String args[]){

   
    Operation obj=new Operation();
    obj.p1();
  
  }

}

