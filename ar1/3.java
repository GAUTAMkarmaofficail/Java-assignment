/*3. Write a java program to search an element in given array

*/
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
   int i=0,j,c=0;
  
       
      int x[]={10,7,5,4,2,5,5};
      System.out.println("Enter Element to search");
        int n=sc.nextInt();
    
        int k[]=new int[i];
       for(i=0;i<x.length;i++)
     {     
           c++;
        

           if(n==x[i])
           k[i]=x[i];
          
           
           break;
 
     }
      if(i==x.length) 
        System.out.println("element not found"); 
      else 
        { 
       
         System.out.println("element found " +c+ " time  at index " +k[i]);
         
        
        
    }

  }
 }


