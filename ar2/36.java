/*36. Write a java program to implement bubble sort algorithm*/
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
	 




   
    int temp;
    for( i=1; i<x.length; i++)
    {
        for(j=0; j<x.length-1; j++)
        {
            if(x[j]>x[j+1])
              {  temp=x[j];
            x[j]=x[j+1];
            x[j+1]=temp;
            }



        }

}

for( i=0; i<x.length; i++)
   System.out.print(" "+x[i]);

}
}
