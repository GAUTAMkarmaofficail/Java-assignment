/*26. Write a Java program to find the largest and smallest element of an array.*/
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
   int i,j,max,min;
   System.out.println("Enter Total no of Element");
     int n=sc.nextInt();
     int  x[] = new int[n];
      
      
      

       for(i=0; i<n; i++)
          {  
            System.out.println("Enter  "+(i+1)+"  Element");
              x[i] = sc.nextInt();
          } 
           max=min=x[0];
          
           for(i=1; i<n; i++)
           {
            if(x[i]<=min)
            min=x[i];
            else
            max=x[i]; 
           }
        
                System.out.println("largest :"+max);
                System.out.println("Smallest :"+min);
   }
} 
