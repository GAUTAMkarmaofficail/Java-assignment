/*33. Write a java program to impelment binary search algorithm*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
     
  
  System.out.println("Enter array length");
   int n = sc.nextInt();
   
     int x[]= new int[n];
     
     for( i=0;i<n;i++)
	  {
	    System.out.println("Enter element Value");
	    x[i]=sc.nextInt();
	  }



    
    int temp=0,serch=6,i,j,li=0;
    int hi=x.length-1;
    int mi=(li+hi)/2;

    while(li<=hi)
    {

        if(x[mi]==serch)
        {
           System.out.print("element present at"+i+"index position");

        }
        else if(x[mi]==serch)
        {
            li=mi+1;
        }
        else
        {

            hi=mi-1;
        }
        mi=(li+hi)/2;
    }

    if(li>hi)
       System.out.print("element not found ");
}
}
