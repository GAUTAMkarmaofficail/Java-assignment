//8.WAP to print the fibonacci series 0 1 1 2 3 5 8 13..........................n terms  

import java.util.Scanner;
class Main{
    public static void main(String args[]){     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to print the fibonacci series 0 1 1 2 3 5 8 13..........................n terms ");
      int a=sc.nextInt();
      System.out.println("***********The fibonacci is*************** ");
      int i=1,f=0,s=1,t=0;
      
     while(i<=a)
    {  
    
    
        System.out.println(f);
        t=f+s;
        f=s;
        s=t;
        i++;
   }

  }
}
