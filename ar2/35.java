/*35. Write a java program to implement selection sort algoritm*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
     int i,j,sum=0;
  
  System.out.println("Enter array length");
   int n = sc.nextInt();
   
     int x[]= new int[n];
     
     for( i=0;i<n;i++)
	  {
	    System.out.println("Enter element Value");
	    x[i]=sc.nextInt();
	  }






    int temp=0,min;
    for(i=1; i<x.length; i++)
    {   min=i;
        for(j=i+1; j<x.length; j++)
        {
            if(x[j]<x[min])
            {
                min=j;
            }

            temp=x[i];
            x[i]=x[min];
            x[min]=temp;

        }

    }

    for(i=0; i<x.length; i++)
         System.out.print(" "+x[i]);

}
	 }
